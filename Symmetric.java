import java.util.Scanner;

public class Symmetric {
    int a[][], m, n;
    static Scanner sc = new Scanner(System.in);

    Symmetric(int mm) {
        m = 0;
        m = mm;
        a = new int[m][m];
    }

    public void accept() {
        System.out.println("Enter the elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        }
    }

    public void print() {
        System.out.println("Original Matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void check() {
        int f = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] != a[j][i]) {
                    f = 1;
                    break;
                }
            }
        }
        if (f == 1)
            System.out.println("Not a Symmetric Matrix");
        else
            System.out.println("Symmetric Matrix");

    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the square matrix");
        int mm = sc.nextInt();
        Symmetric obj = new Symmetric(mm);
        obj.accept();
        obj.print();
        obj.check();
    }
}
