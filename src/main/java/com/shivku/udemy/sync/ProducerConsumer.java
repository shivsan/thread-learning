package com.shivku.udemy.sync;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumer {
    private LinkedBlockingDeque<String> strings = new LinkedBlockingDeque<>();

    public class Producer extends Thread {
        public void produce() {
            System.out.println("produce");
            final var stringsToAdd = new String[]{"String 1", "String 2", "String 3", "String 4"};

            for (var str : stringsToAdd) {
                strings.add(str);
            }
        }

        public void run() {
            produce();
        }
    }

    public class Consumer extends Thread {
        public void consume() {
            System.out.println("consume");
            int counter = 0;

            while (counter < 4) {
                while(strings.isEmpty()) {
                    System.out.println("Beef" + strings);
                    strings.remove(0);
                }
            }
        }

        public void run() {
            consume();
        }
    }

    public void running() {
        var producer = new Producer();
        var consumer = new Consumer();

        producer.run();
        consumer.run();
    }
}
