package svyatoslav_petukhov_oop1;

public class Main {
    public static void main(String[] args) {

// Создание сотрудника с указанием всех данных
        Employee employeePrimer = new Employee("Svyatoslav", "Petukhov", "engineer", 100000);
        System.out.println(employeePrimer); // проверка выведения сотрудника
        System.out.println();

// создание новых сотрудников
        Employee emp1 = new Employee("Ivan", "Ivanov", "manager", 50000);
        Employee emp2 = new Employee("Alex", "Portov", "admin", 75000);
        Employee emp3 = new Employee("Gerasim", "Yolkovich", "director", 200000);

// Создание отдела с конкретными сотрудниками
        Employee [] employees = {emp1,emp2,emp3};
        Department department = new Department("IT", employees);
        // проверка
        System.out.println("First list:");
        department.printEmployees(department.getEmployees());
        System.out.println();

// Кол-во сотрудников
        System.out.println("Count of employees: " + department.getEmployeeCount());
        System.out.println();

// Сумма зарплат всех сотрудников
        System.out.println("Total amount of salaries: " +department.getDepartmentName() +" : "
                                                            +department.getEmployeeSalarySum());
        System.out.println();

// Поиск сотрудника по имени и фамилии (не найден)
        Employee foundEmployee = department.getEmployeeByName("Svyatoslav", "Petukhov");
            if (foundEmployee != null) {
                System.out.println("Found employee: " +foundEmployee.getFirstName() +" "
                                                        +foundEmployee.getLastName() +" "
                                                        +foundEmployee.getPosition());
            } else {
                System.out.println("Unidentified employee");
            }
        System.out.println();

// Добавление нового сотрудника в отдел и проверка всего списка
        department.addEmployee(employeePrimer);
            System.out.println("Current list (after hiring):");
            department.printEmployees(department.getEmployees());
        System.out.println();

// Поиск сотрудника по имени и фамилии после добавления (найден)
        foundEmployee = department.getEmployeeByName("Svyatoslav", "Petukhov");
        if (foundEmployee != null) {
            System.out.println("Found employee: " +foundEmployee.getFirstName() +" "
                    +foundEmployee.getLastName() +" "
                    +foundEmployee.getPosition());
        } else {
            System.out.println("Unidentified employee");
        }
        System.out.println();

// Увольнение сотрудника
        department.fireEmployee("Svyatoslav", "Petukhov", "engineer");
        //проверка
        System.out.println("Current list (after dismissal):");
        department.printEmployees(department.getEmployees());
        System.out.println();

//Отсортированные сотрудники
        Employee[] sortedEmployees = department.getSortedEmployees();
        System.out.println("Sorted employees:");
        department.printEmployees(sortedEmployees);
    }
}
