 abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int facultyNumber;
    private String major;

    public Student(String name, int age, int facultyNumber, String major) {
        super(name, age);
        this.facultyNumber = facultyNumber;
        this.major = major;
    }

    public void display() {
        super.display();
        System.out.println("Faculty number: " + facultyNumber);
        System.out.println("Major: " + major);
    }
}

class Employee extends Person {
    private int personalNumber;
    private String date;

    public Employee(String name, int age, int personalNumber, String date) {
        super(name, age);
        this.personalNumber = personalNumber;
        this.date = date;
    }

    public void display() {
        super.display();
        System.out.println("Personal number: " + personalNumber);
        System.out.println("Date: " + date);
    }
}

class Faculty extends Employee {
    private String position;

    public Faculty(String name, int age, int personalNumber, String date, String position) {
        super(name, age, personalNumber, date);
        this.position = position;
    }

    public void display() {
        super.display();
        System.out.println("Position: " + position);
    }
}

class Staff extends Employee {
    private String jobTitle;

    public Staff(String name, int age, int personalNumber, String date, String jobTitle) {
        super(name, age, personalNumber, date);
        this.jobTitle = jobTitle;
    }

    public void display() {
        super.display();
        System.out.println("Job title: " + jobTitle);
    }
}

class MainClass {
    public static void main(String[] args) {
        Student student = new Student("John", 20, 123456, "Computer Science");
        Faculty faculty = new Faculty("Jane", 40, 654321, "2010-01-01", "Professor");
        Staff staff = new Staff("Bob", 30, 111111, "2012-01-01", "Academic department");

        student.display();
        faculty.display();
        staff.display();
    }
}
