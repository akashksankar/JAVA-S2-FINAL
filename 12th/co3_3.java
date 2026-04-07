class Person {
    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    int empId;
    String companyName;
    String qualification;
    double salary;

    Employee(String name, String gender, String address, int age,
             int empId, String companyName, String qualification, double salary) {

        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject;
    String department;
    String teacherId;

    Teacher(String name, String gender, String address, int age,
            int empId, String companyName, String qualification, double salary,
            String subject, String department, String teacherId) {

        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    void display() {
        System.out.println("-------------");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("EmpID: " + empId);
        System.out.println("Company: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("TeacherID: " + teacherId);
    }
}

public class co3_3 {
    public static void main(String[] args) {

        Teacher[] teachers = new Teacher[2];

        teachers[0] = new Teacher(
                "Amal", "Male", "Vadakara", 32,
                1001, "Eduport", "MSc", 45000,
                "Maths", "Science", "T101");

        teachers[1] = new Teacher(
                "Shahana", "Female", "Calicut", 29,
                1002, "Xylem", "PhD", 50000,
                "Physics", "Science", "T103");

        teachers[0].display();
        teachers[1].display();
    }
}
