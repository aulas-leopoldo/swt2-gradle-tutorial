/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println("Imprime isso aqui primeiro, antes do hello...");
        System.out.println(new App().getGreeting());
        System.out.println("Isso aqui vem depois do hello");
    }
}
