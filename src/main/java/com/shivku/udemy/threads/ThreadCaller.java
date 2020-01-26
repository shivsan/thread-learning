package com.shivku.udemy.threads;

public class ThreadCaller {
    public void runSomethingWithRunnable() {
        var threadRunner = new Thread(new Runner(3));
        var threadRunner2 = new Thread(new Runner(4));
        threadRunner.start();
        threadRunner2.start();
    }

    public void runWithAnonymous() {
        var thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i = 0; i<10; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });
    }
}
