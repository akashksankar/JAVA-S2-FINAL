import java.util.Scanner;

public class Search {

    int[] arr = new int[10];
    int count;

    public void get() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the count of array:");
        this.count = sc.nextInt();

        System.out.println("Enter the array elements:");
        for (int i = 0; i < this.count; i++) {
            this.arr[i] = sc.nextInt();
        }
    }

    public void itemSearch() {
        int n, flag = 0, i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element you want to search:");
        n = sc.nextInt();

        for (i = 0; i < this.count; i++) {
            if (this.arr[i] == n) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            System.out.println("Element found at position " + (i + 1));
        } else {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        Search s1 = new Search();
        s1.get();
        s1.itemSearch();
    }
}

