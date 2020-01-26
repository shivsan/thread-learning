package com.shivku.udemy.sync;

import java.util.Scanner;

public class PreventCompilerOptimizationInThreads extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopThread() {
        running = false;
    }

    public void runThread() {
        this.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        this.stopThread();
    }
}
