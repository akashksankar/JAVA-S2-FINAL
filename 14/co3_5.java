import java.util.*;
import java.io.*;

interface Sports {
    public void sports_getData();
    public void sports_dispData();
}

class Student {
    String name;
    int roll_no;
    int score;

    Student(String name,int roll,int m1) {
        this.name = name;
        this.roll_no = roll;
        this.score = m1;
    }

    void display() {
        System.out.println("Student Details");
        System.out.println("Name of Student: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Academic score: " + score);
    }
}

class Result extends Student implements Sports {
    int sportsScore;
    Scanner sc = new Scanner(System.in);

    Result(String name,int roll,int m1) {
        super(name,roll,m1);
    }

    public void sports_getData() {
        System.out.print("Enter the score obtained in sports: ");
        sportsScore = sc.nextInt();
    }

    public void sports_dispData() {
        System.out.println("Sports score: " + sportsScore);
    }
}

class co3_5 {
    public static void main(String args[]) {
        String name;
        int roll,mark;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        name = sc.nextLine();

        System.out.print("Enter the roll no: ");
        roll = sc.nextInt();

        System.out.print("Enter the academic score: ");
        mark = sc.nextInt();

        Result re = new Result(name,roll,mark);

        re.sports_getData();
        re.display();
        re.sports_dispData();
    }
}
