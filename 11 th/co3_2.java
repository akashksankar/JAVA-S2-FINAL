import java.util.Scanner;

class Employee {
    int id;
    String name;
    int sal;
    String address;

    Employee(int id, String name, int sal, String address) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.address = address;
    }

    public void display() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + sal);
        System.out.println("Employee address: " + address);
    }
}

class Teacher extends Employee {
    String dept;
    String sub;

    Teacher(int id, String name, int sal, String address, String dept, String sub) {
        super(id, name, sal, address);
        this.dept = dept;
        this.sub = sub;
    }

    public void display() {
        super.display();
        System.out.println("Department: " + dept);
        System.out.println("Subject: " + sub);
        System.out.println();
    }
}

public class co3_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter teacher " + (i + 1) + " details:");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            int sal = sc.nextInt();
            sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Subject: ");
            String sub = sc.nextLine();

            t[i] = new Teacher(id, name, sal, address, dept, sub);
        }

        System.out.println("\nTeacher Details:\n");

        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        sc.close();
    }
}
