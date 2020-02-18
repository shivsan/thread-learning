package com.shivku.udemy.sync;

import java.util.Arrays;
import java.util.List;

public class SimpleThreadProgram {

    public void threading() {
        //List list = Arrays.asList(10, 5, 10, 20);

        for (int i = 0; i < 100; i++) {
            int finalI = i;
            Thread th = new Thread(() -> {
                try {
                    Thread.sleep(1000 - finalI * 10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(finalI);
            });

            th.start();
        }
    }
}
