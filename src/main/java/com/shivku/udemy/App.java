package com.shivku.udemy;

import com.shivku.udemy.sync.PreventCompilerOptimizationInThreads;
import com.shivku.udemy.sync.ProducerConsumer;
import com.shivku.udemy.threads.ThreadCaller;

class Runner extends Thread {
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

public class App {
    public static void main(String[] args) {
//        final var runner = new Runner(1);
//        runner.start();
//        final var runner1 = new Runner(2);
//        runner1.start();
//        ThreadCaller threadCaller = new ThreadCaller();
//        threadCaller.runSomethingWithRunnable();
//        var volatileTest = new PreventCompilerOptimizationInThreads();
//        volatileTest.runThread();
        var pc = new ProducerConsumer();
        pc.running();

    }
}
