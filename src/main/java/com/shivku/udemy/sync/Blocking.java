package com.shivku.udemy.sync;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Blocking {
    Deque<String> gangOfFour = new LinkedBlockingDeque<>();

    class Producer extends Thread {
        String[] authors = {"E Gamma", "R Johnson", "R Helm", "J Vlissides"};

        public void run() {
            System.out.println("process");
            for (String author : authors) {
                gangOfFour.add(author);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
        }
    }

    class Consumer extends Thread {
        int processAuthors = 0;
        int totalAuthors = 4;

        public void run() {
            while (processAuthors < totalAuthors) {
                while (gangOfFour.isEmpty()){} {
                    System.out.println(gangOfFour.remove());
                    processAuthors++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Blocking blocking = new Blocking();
        blocking.new Producer().start();
        blocking.new Consumer().start();
    }
}