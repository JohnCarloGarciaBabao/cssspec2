/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2;

/**
 *
 * @author jgbabao
 */
public class ThreadDemo {
    public static void printNumbers() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(
                    Thread.currentThread().getId()
                    + ": " + i);
        }
    }

    public static void main(String[] args) {
        new Thread2().run();
    }
}
