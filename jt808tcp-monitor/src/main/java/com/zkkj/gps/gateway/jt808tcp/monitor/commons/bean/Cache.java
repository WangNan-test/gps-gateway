package com.zkkj.gps.gateway.jt808tcp.monitor.commons.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 基于HashMap与读写锁的本地缓存
 * @author suibozhuliu
 */
public class Cache<K, V> {

    private static final Logger log = LoggerFactory.getLogger(Cache.class.getSimpleName());

    private ReadWriteLock rwl = new ReentrantReadWriteLock();
    private Lock read = rwl.readLock();
    private Lock write = rwl.writeLock();

    private Map<K, V> cache = null;

    public Cache() {
        this.cache = new LRUMap(64);
    }

    public Cache(int initialCapacity) {
        this.cache = new LRUMap(initialCapacity);
    }

    public Cache(Map<K, V> cache) {
        this.cache = cache;
    }

    public V get(K key, Callable<? extends V> loader) {
        read.lock();
        V value = cache.get(key);
        if (value == null) {
            read.unlock();
            write.lock();
            value = cache.get(key);
            if (value == null) {
                try {
                    value = loader.call();
                    cache.put(key, value);
                } catch (Exception e) {
                    log.error("Cache Callback Error", e);
                }
            }
            write.unlock();
            read.lock();
        }
        read.unlock();
        return value;
    }

}