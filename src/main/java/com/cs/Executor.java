package com.cs;


import java.util.concurrent.*;

public class Executor {
    public static void main(String[] args) {

    }

    /**
     * newCachedThreadPool 创建一个可缓存线程池，线程池的最大长度无限制，但如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
     * @return
     */
    public static ExecutorService newCachedThreadPool() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        return threadPoolExecutor;
    }

    /**
     * newFixedThreadPool  创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
     * @param nThreads 线程数量
     * @return
     */
    public static ExecutorService newFixedThreadPool(int nThreads) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(nThreads, nThreads, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        return threadPoolExecutor;
    }

    /**
     * newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
     * @param corePoolSize
     * @return
     */
    public static ExecutorService newScheduledThreadPool (int corePoolSize) {
        ScheduledThreadPoolExecutor threadPoolExecutor = new ScheduledThreadPoolExecutor(corePoolSize);
        return threadPoolExecutor;
    }



}

