package OOP_Java.HW6.Zadanie_1;

public class TaxForSalary {
    public int calculateNetSalary() {
        Employee emp = new Employee("Stas",1988,50000);
        int tax = (int) (emp.getBaseSalary() * 0.25);//calculate in otherway
        return emp.getBaseSalary() - tax;
    }
}
