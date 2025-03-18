package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, ИМЯ!");
        Tester tester = new Tester("Илья", "Филиппов");
        System.out.println(tester);
        tester.salaryUp(10.1);
        tester.salaryUp(20);
        tester.salaryUp(100, "Васислий Иванович");
        Tester.testMethod();
    }
}
