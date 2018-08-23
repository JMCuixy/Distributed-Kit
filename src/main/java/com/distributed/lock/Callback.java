package com.distributed.lock;

/**
 * Created by sunyujia@aliyun.com on 2016/2/23.
 */
public interface Callback {

    /**
     * 得到锁的回调函数
     * @return
     * @throws InterruptedException
     */
    Object onGetLock() throws InterruptedException;

    /**
     * 未获得锁超时回调函数
     * @return
     * @throws InterruptedException
     */
    Object onTimeout() throws InterruptedException;
}
