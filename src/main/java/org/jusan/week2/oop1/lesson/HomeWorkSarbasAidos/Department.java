package org.jusan.week2.oop1.lesson.HomeWorkSarbasAidos;


import java.util.Arrays;
import java.util.Comparator;


public class Department {
    private Employee[] employees;
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new Employee[0];
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department(Employee ...employees){
        this.employees = employees;
    }

    public Integer getCountEmployees(){
        return employees.length;
    }


    public Double getCountSalaryEmployees(){
        double sum=0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void DeleteEmployee(String surname, String name, String position) {
        for (Employee employee : employees) {
            if(surname.equals(employee.getName())
                    && surname.equals(employee.getSurname())
                    && surname.equals(employee.getPosition())){
                employee = null;
            }
        }
    }

    public void AddEmployee(Employee newEmployee){
        Employee[] newEmployees = new Employee[employees.length + 1];
        for(int i = 0; i < employees.length; i++) {
            newEmployees[i] = employees[i];
        }

        newEmployees[newEmployees.length-1] = newEmployee;

        employees = newEmployees;
    }

    public Employee[] getSortedEmployees(){
        Employee[] sortedEmployees = employees.clone();
        Arrays.sort(sortedEmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int surnameComparsion = o1.getSurname().compareTo(o2.getSurname());
                if(surnameComparsion != 0){
                    return surnameComparsion;
                } else {
                    return  o1.getName().compareTo(o2.getName());
                }
            }
        });
        return sortedEmployees;
    }


}

