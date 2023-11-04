import java.util.*;

public class RightRotation {
    int a[][], b[][];
    int m;

    RightRotation() {
        m = 0;
        a = new int[m][m];
        b = new int[m][m];
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        m = sc.nextInt();
        a = new int[m][m];
        b = new int[m][m];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    void rotate() {
        // Bring the last row to the first
        int temp[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                temp[i][j] = a[m - j - 1][m - i - 1];
            }
        }
        // Rotating the matrix left because 270 degree right is 90 degrees left
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = temp[i][m - j - 1];
            }
        }
    }

    void display() {
        System.out.println("Original Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("New Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightRotation obj = new RightRotation();
        obj.accept();
        obj.rotate();
        obj.display();
    }
}
