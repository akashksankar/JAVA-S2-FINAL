import java.util.Scanner;

class Matrix {
    int r, c;
    int[][] arr = new int[10][10];

    
    public void get() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        r = sc.nextInt();

        System.out.println("Enter number of columns:");
        c = sc.nextInt();

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Method to add two matrices
    public static Matrix sum(Matrix m1, Matrix m2) {
        Matrix temp = new Matrix();

        if (m1.r == m2.r && m1.c == m2.c) {
            temp.r = m1.r;
            temp.c = m1.c;

            for (int i = 0; i < m1.r; i++) {
                for (int j = 0; j < m1.c; j++) {
                    temp.arr[i][j] = m1.arr[i][j] + m2.arr[i][j];
                }
            }
        } else {
            System.out.println("Addition not possible");
        }
        return temp;
    }

    // Method to display matrix
    public void display() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();

        System.out.println("Enter first matrix:");
        m1.get();

        System.out.println("Enter second matrix:");
        m2.get();

        Matrix result = Matrix.sum(m1, m2);

        System.out.println("Addition of matrices:");
        result.display();
    }
}



