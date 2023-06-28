package OOP_Java.HW6.Zadanie_1;

/*
1) Переписать код в соответствии с Single Responsibility Principle:
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}*/
// Решение: Создал еще один класс который будет отвечать исключительно за вычисление налога
public class Employee {
    private String name;
    private int dob;
    private int baseSalary;
    public Employee(String name, int dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob;
    }
}
