import java.util.Scanner;

class Employee {
    String empNo;     // Can be numbers or letters
    String name;
    double salary;

    // Read employee details
    void read(Scanner sc, int index) {
        System.out.println("\nEnter details for employee " + index);
        System.out.print("Enter Employee Number: ");
        empNo = sc.nextLine();
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        while (true) { // loop until valid salary entered
            System.out.print("Enter Employee Salary: ");
            try {
                salary = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number for salary.");
            }
        }
    }

    // Display employee details
    void display() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Employee Name  : " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        while (true) { // ensure number of employees is valid
            System.out.print("Enter number of employees: ");
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    System.out.println("Please enter a positive number.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }

        Employee[] employees = new Employee[n];

        // Read employee data
        for (int i = 0; i < n; i++) {
            employees[i] = new Employee();
            employees[i].read(sc, i + 1);
        }

        // Display employee data
        System.out.println("\n--- Employee Details ---");
        for (Employee e : employees) {
            e.display();
            System.out.println("------------------------");
        }

        sc.close();
    }
}
