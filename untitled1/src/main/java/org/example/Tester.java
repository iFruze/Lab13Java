package org.example;

public class Tester {
    String name;
    String surname;
    int expirienceInYears;
    String englishLevel;
    double salary;
    public Tester(String name, String surname){
        this(name, surname, 12, "C2");
    }
    public Tester(String name, String surname, int expirienceInYears, String englishLevel){
        this(name, surname, expirienceInYears, englishLevel, 1200.54);
    }
    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary){
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Tester " + this.name + " " + this.surname + ". Expirince: " + this.expirienceInYears + ". Level: " + this.englishLevel + ".Salary: " + this.salary;
    }
    public void salaryUp(int a){
        this.salary += a;
        System.out.println("Зарпалата повысилась на " + a + "р.");
    }
    public void salaryUp(double a){
        this.salary += a;
        System.out.println("Зарпалата повысилась на " + a + "р.");
    }
    public void salaryUp(int a, String name){
        this.salary += a;
        System.out.println("Зарпалата повысилась на " + a + "р. директором: " + name);
    }
    public static void testMethod(){
        System.out.println("Статический метод работает корректно.");
    }

}
