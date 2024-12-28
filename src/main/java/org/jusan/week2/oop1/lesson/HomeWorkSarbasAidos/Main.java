package org.jusan.week2.oop1.lesson.HomeWorkSarbasAidos;

public class Main {
    public static void main(String[] args) {
        // 1. Тестируем конструкторы Employee
        System.out.println("==  Тестирование конструкторов Employee ==");

        // Конструктор с именем и фамилией
        Employee employee1 = new Employee("Айдос", "Досарбаев");
        System.out.println("Сотрудник 1: " + employee1);

        // Конструктор с именем, фамилией, должностью и зарплатой
        Employee employee2 = new Employee("Aidos", "Aidosov", "Менеджер", 50000);
        System.out.println("Сотрудник 2: " + employee2);

        // 2. Тестируем геттеры и сеттеры Employee
        System.out.println("\n== Тестирование геттеров и сеттеров Employee ==");

        // Меняем данные сотрудника 1
        employee1.setPosition("Программист");
        employee1.setSalary(70000);
        employee1.setName("Айдосхан");
        employee1.setSurname("Казахстанов");
        System.out.println("Обновлённый сотрудник 1: " + employee1);

        // 3. Тестируем конструкторы Department
        System.out.println("\n== Тестирование конструкторов Department ==");

        // Создаём отдел с названием и без сотрудников
        Department department1 = new Department("IT");
        System.out.println("Отдел 1: " + department1);

        // Создаём отдел с уже готовым массивом сотрудников
        Employee[] employeesArray = { employee1, employee2 };
        Department department2 = new Department(employeesArray);
        System.out.println("Отдел 2: " + department2);

        //4. Тестируем методы Department
        System.out.println("\n== ??  Тестирование методов Department ==");

        // Нанимаем нового сотрудника
        Employee newEmployee = new Employee("Пётр", "Петров", "Тестировщик", 45000);
        department2.AddEmployee(newEmployee);
        System.out.println("После найма сотрудника Петра: " + department2);

        // Увольняем сотрудника
        department2.DeleteEmployee("Айдос", "Айдосов", "Менеджер");
        System.out.println("После увольнения сотрудника Айдоса: " + department2);

        // Получаем список всех сотрудников отдела
        Employee[] allEmployees = department2.getEmployees();
        System.out.println("Список всех сотрудников отдела 2:");
        for (Employee emp : allEmployees) {
            System.out.println(emp);
        }

        // Получаем отсортированный список сотрудников
        System.out.println("\n== Сортировка сотрудников по фамилии ==");
        Employee[] sortedEmployees = department2.getSortedEmployees();
        for (Employee emp : sortedEmployees) {
            System.out.println(emp);
        }

        // Проверка количества сотрудников и общей зарплаты
        System.out.println("\nОбщее количество сотрудников в отделе 2: " + department2.getCountEmployees());
        System.out.println("Общая зарплата всех сотрудников отдела 2: " + department2.getCountSalaryEmployees());
    }
}
