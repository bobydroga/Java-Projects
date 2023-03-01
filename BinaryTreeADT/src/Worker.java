// The Worker class represents an employee with a name and salary.
public class Worker {
    private String name;
    private int salary;

    // Constructor method that sets the name and salary of the worker object.
    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter method for the name of the worker.
    public String getName() {
        return name;
    }

    // Getter method for the salary of the worker.
    public int getSalary() {
        return salary;
    }

    // Setter method for the name of the worker.
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for the salary of the worker.
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // String representation of the worker object, in the format "name (salary)".
    @Override
    public String toString() {
        return String.format("%s ($%d)", name, salary);
    }
}
