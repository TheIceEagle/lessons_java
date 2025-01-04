package svyatoslav_petukhov_oop1;

public class Employee {
    private String firstName; // ИМЯ
    private String lastName; // ФАМИЛИЯ
    private String position; // ДОЛЖНОСТЬ
    private int salary; // ЗАРПЛАТА

    // Конструктор с именем, фамилией, позицией и зарплатой
public Employee (String firstName, String lastName, String position, int salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = position;
    this.salary = salary;
}
    // Геттеры и сеттеры для доступа к полям
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Метод для отображения информации о сотруднике
@Override
    public String toString () {
    return "Employee{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", position='" + position + '\'' +
            ", salary='" + salary + '\'' +
            '}';
}
}
