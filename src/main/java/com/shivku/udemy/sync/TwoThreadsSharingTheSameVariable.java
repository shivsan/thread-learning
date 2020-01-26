package com.shivku.udemy.sync;

// Lesson 3
public class TwoThreadsSharingTheSameVariable {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public void runThread() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
//                this.count++;
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
//                this.count++;
                increment();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(count);
    }
}
