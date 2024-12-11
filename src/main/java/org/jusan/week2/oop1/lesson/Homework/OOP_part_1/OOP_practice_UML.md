# UML Class Diagram: Organization System

## Employee
#### Description
Represents an employee of the organization with personal details and job information.

#### Attributes
- `-firstName: String` (private)
- `-lastName: String` (private)
- `-position: String` (private)
- `-salary: double` (private)

#### Constructors
+ `Employee(firstName: String, lastName: String)`
    - Creates employee with default position (engineer) and salary (30k)
+ `Employee(firstName: String, lastName: String, position: String, salary: double)`
    - Creates employee with specified position and salary

#### Methods
+ `getFirstName(): String`
+ `setFirstName(firstName: String): void`
+ `getLastName(): String`
+ `setLastName(lastName: String): void`
+ `getPosition(): String`
+ `setPosition(position: String): void`
+ `getSalary(): double`
+ `setSalary(salary: double): void`

## Department
#### Description
Represents a department within the organization that manages a collection of employees.

#### Attributes
- `-name: String` (private)
- `-employees: Employee[]` (private)

#### Constructors
+ `Department(name: String)`
    - Creates department with given name and empty employee array
+ `Department(employees: Employee[])`
    - Creates department with initial set of employees

#### Methods
+ `getName(): String`
+ `setName(name: String): void`
+ `getEmployeeCount(): int`
+ `getTotalSalary(): double`
+ `findEmployee(lastName: String, firstName: String): Employee`
+ `fireEmployee(lastName: String, firstName: String, position: String): void`
+ `hireEmployee(employee: Employee): void`
+ `getEmployees(): Employee[]`
+ `getSortedEmployees(): Employee[]`

## Relationships
* **Composition**: Department *contains* Employee
    - Multiplicity: One Department (1) to Many Employees (*)
    - Direction: Unidirectional (Department ? Employee)