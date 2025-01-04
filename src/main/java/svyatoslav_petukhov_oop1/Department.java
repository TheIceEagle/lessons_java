package svyatoslav_petukhov_oop1;

public class Department {
    private String departmentName; // Название отдела
    private Employee[] employees; // Массив сотрудников отдела

    // Конструктор, принимающий название отдела (массив сотрудников = пустой)
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new Employee[0]; // Пустой массив сотрудников
    }

    // Конструктор, принимающий массив сотрудников
    public Department(String departmentName, Employee[] employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

// МЕТОД ДЛЯ ПОЛУЧЕНИЯ ОБЩЕГО КОЛИЧЕСТВА СОТРУДНИКОВ В ОТДЕЛЕ
    public int getEmployeeCount() {
        return employees.length;
    }

// МЕТОД ДЛЯ ПОЛУЧЕНИЯ ОБЩЕЙ ЗАРПЛАТЫ ВСЕХ СОТРУДНИКОВ В ОТДЕЛЕ
    public int getEmployeeSalarySum() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

// МЕТОД ДЛЯ ПОИСКА СОТРУДНИКА ПО ФАМИЛИИ И ИМЕНИ
    public Employee getEmployeeByName(String firstName, String lastName) {
        for (Employee employee : employees) {
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
                return employee;
            }
        }
        return null;
    }

// МЕТОД ДЛЯ УВОЛЬНЕНИЯ СОТРУДНИКА
    public void fireEmployee (String firstName, String lastName, String position) {
        //создаём "флаг"
        int indexToRemove = -1;
        for (int i=0;i<employees.length;i++) {
            if (employees[i].getFirstName().equals(firstName) &&
                employees[i].getLastName().equals(lastName) &&
                employees[i].getPosition().equals(position)) {
                indexToRemove = i; // если найдено совпадение присваиваем флагу индекс совпадения
                break; // выход из цикла
            }
        }
        // Если сотрудник не найден, выходим из метода
        if (indexToRemove == -1) {
            System.out.println("Unidentified employee");
            return;
        }
        // Создаём новый массив на 1 элемент меньше
        Employee [] newEmployees = new Employee[employees.length-1];
        // Копируем элементы до того, который нужно удалить
        System.arraycopy(employees,0,newEmployees,0,indexToRemove);
        // Копируем элементы после удаляемого сотрудника
        System.arraycopy(employees,indexToRemove+1,newEmployees,indexToRemove,employees.length-indexToRemove-1);
        // Обновляем ссылку на массив сотрудников
        employees = newEmployees;
    }

// МЕТОД ДЛЯ НАЙМА/ДОБАВЛЕНИЯ НОВОГО СОТРУДНИКА В ОТДЕЛ
    public void addEmployee (Employee employee) {
        //создаём новый массив с увеличением размера для возможности добавления нового сотрудника
        Employee[] newEmployees = new Employee[employees.length + 1];
        // копируем все элементы из старого массива в новый
        System.arraycopy(employees, 0, newEmployees, 0, employees.length);
                    /*
                    или можно использовать стандартный метод через for
                        for (int i=0;i<employees.length;i++) {
                            newEmployees[i] = employees[i];}
                   */
        // добавляем в новый массив нового сотрудника на последнее место в массиве = employees.length
        newEmployees[employees.length] = employee;
        // обновляем ссылку
        employees = newEmployees;
    }

// МЕТОД ДЛЯ ПОЛУЧЕНИЯ ТЕКУЩЕГО МАССИВА СОТРУДНИКОВ
    public Employee[] getEmployees() {
        return employees;
    }

// МЕТОД ДЛЯ ВОЗВРАТА ОТСОРТИРОВАННЫХ СОТРУДНИКОВ
    public Employee[] getSortedEmployees() {
        Employee[] sortedEmployees = employees.clone();  // Создаем копию массива сотрудников
        bubbleSort(sortedEmployees);  // Сортируем с использованием пузырьковой сортировки
        return sortedEmployees;  // Возвращаем отсортированный массив
    }
        // Пузырьковая сортировка
    private void bubbleSort(Employee[] array) {
        int n = array.length;
        // Внешний цикл — для проходов по массиву
        for (int i = 0; i < n - 1; i++) {
        // Внутренний цикл — для сравнения соседних элементов
        for (int j = 0; j < n - 1 - i; j++) {
        // Сравниваем по фамилии, если одинаковы, тогда по имени
            if (array[j].getLastName().compareTo(array[j + 1].getLastName()) > 0 ||
                (array[j].getLastName().compareTo(array[j + 1].getLastName()) == 0 &&
                 array[j].getFirstName().compareTo(array[j + 1].getFirstName()) > 0)) {
                // Меняем их местами, если они в неправильном порядке
                Employee temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                }
            }
        }
    }

// МЕТОД ДЛЯ ВЫВОДА ИНФОРМАЦИИ О ВСЕХ СОТРУДНИКАХ В ОТДЕЛЕ
    public void printEmployees (Employee[] employeesToPrint){
        for (Employee employee : employeesToPrint) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getPosition() + " " + employee.getSalary());
        }
    }

}
