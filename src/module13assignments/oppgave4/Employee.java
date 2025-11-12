package module13assignments.oppgave4;

public abstract class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Warning: name not valid");
        }

        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Warning: age to low");
        }

        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Warning: employees must be paid");
        }

    }

    public double getSalary() {
        return this.salary;
    }


    public String toString() {
        return "Name: " + this.name + ", age: " + this.age + ", salary: " + this.salary;
    }

}
