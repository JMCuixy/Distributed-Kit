package com.distributed.lock;

import java.util.concurrent.TimeUnit;

/**
 * Created by sunyujia@aliyun.com on 2016/2/26.
 */
public interface DistributedReentrantLock {

    /**
     * 得到锁
     * @param timeout
     * @param unit
     * @return
     * @throws InterruptedException
     */
    boolean tryLock(long timeout, TimeUnit unit) throws InterruptedException;

    /**
     * 释放锁
     */
    void unlock();
}
