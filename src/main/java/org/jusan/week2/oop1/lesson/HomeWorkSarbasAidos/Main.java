package org.jusan.week2.oop1.lesson.HomeWorkSarbasAidos;

public class Main {
    public static void main(String[] args) {
        // 1. ��������� ������������ Employee
        System.out.println("==  ������������ ������������� Employee ==");

        // ����������� � ������ � ��������
        Employee employee1 = new Employee("�����", "���������");
        System.out.println("��������� 1: " + employee1);

        // ����������� � ������, ��������, ���������� � ���������
        Employee employee2 = new Employee("Aidos", "Aidosov", "��������", 50000);
        System.out.println("��������� 2: " + employee2);

        // 2. ��������� ������� � ������� Employee
        System.out.println("\n== ������������ �������� � �������� Employee ==");

        // ������ ������ ���������� 1
        employee1.setPosition("�����������");
        employee1.setSalary(70000);
        employee1.setName("��������");
        employee1.setSurname("�����������");
        System.out.println("���������� ��������� 1: " + employee1);

        // 3. ��������� ������������ Department
        System.out.println("\n== ������������ ������������� Department ==");

        // ������ ����� � ��������� � ��� �����������
        Department department1 = new Department("IT");
        System.out.println("����� 1: " + department1);

        // ������ ����� � ��� ������� �������� �����������
        Employee[] employeesArray = { employee1, employee2 };
        Department department2 = new Department(employeesArray);
        System.out.println("����� 2: " + department2);

        //4. ��������� ������ Department
        System.out.println("\n== ??  ������������ ������� Department ==");

        // �������� ������ ����������
        Employee newEmployee = new Employee("ϸ��", "������", "�����������", 45000);
        department2.AddEmployee(newEmployee);
        System.out.println("����� ����� ���������� �����: " + department2);

        // ��������� ����������
        department2.DeleteEmployee("�����", "�������", "��������");
        System.out.println("����� ���������� ���������� ������: " + department2);

        // �������� ������ ���� ����������� ������
        Employee[] allEmployees = department2.getEmployees();
        System.out.println("������ ���� ����������� ������ 2:");
        for (Employee emp : allEmployees) {
            System.out.println(emp);
        }

        // �������� ��������������� ������ �����������
        System.out.println("\n== ���������� ����������� �� ������� ==");
        Employee[] sortedEmployees = department2.getSortedEmployees();
        for (Employee emp : sortedEmployees) {
            System.out.println(emp);
        }

        // �������� ���������� ����������� � ����� ��������
        System.out.println("\n����� ���������� ����������� � ������ 2: " + department2.getCountEmployees());
        System.out.println("����� �������� ���� ����������� ������ 2: " + department2.getCountSalaryEmployees());
    }
}
