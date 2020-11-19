package com.ss;

public class volatileLearn {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {

            }, String.valueOf(i)).start();
        }
    }
}
