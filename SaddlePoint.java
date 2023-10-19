//not working

import java.util.Scanner;

public class SaddlePoint {
    int m, n;
    int arr[][];
    Scanner sc = new Scanner(System.in);

    SaddlePoint(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    int minOfRow(int[] row) {
        int minIndex = 0;

        for (int i = 1; i < row.length; i++) {
            if (row[i] < row[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    void accept() {
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the data");
                arr[i][j] = sc.nextInt();
            }
    }

    void display() {
        System.out.println("Original Matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }

    void saddle() {
        for (int i = 0; i < m; i++) {
            int k = minOfRow(arr[i]);
            int max = arr[i][k];

            for (int j = 0; j < n; j++) {
                if (arr[j][k] > max) {
                    max = arr[j][k];
                }
            }
            if (max == arr[i][k]) {
                System.out.println("Saddle Point at " + i + ", " + k);
                System.out.println("Saddle Point = " + arr[i][k]);
                return;
            }
        }
        System.out.println("No saddle point found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns");
        int n = sc.nextInt();
        SaddlePoint obj = new SaddlePoint(m, n);
        obj.accept();
        obj.display();
        obj.saddle();
    }
}