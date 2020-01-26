package com.shivku.udemy.threads;

public class Runner implements Runnable {
    public int i = 0;

    public Runner(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        for (int i : new int[]{0, 1, 2}) {
            try {
                Thread.sleep(100);
                System.out.println(this.i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
