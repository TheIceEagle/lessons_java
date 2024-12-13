package org.jusan.week2.bauyrzhan_abdaliyev.org;

public class Department {
    private String depName;

    private Employee[] employees;

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getCountOfEmployees() {
        return employees.length;
    }

    public double getSalariesOfEmployees() {
        double sum = 0;
        for(Employee employee: employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
}
