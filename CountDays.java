import java.util.Scanner;

public class CountDays {
    int d, m, y;

    CountDays(int dd, int mm, int yy) {
        d = dd;
        m = mm;
        y = yy;
    }

    void countdays() {
        int f = 28;
        m = m - 1;

        if (y % 400 == 0 || y % 4 == 0)
            f = 29;
        int[] days = { 31, f, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if ((y < 1500) || (m < 1 || m > 12) || (d < 1 || d > days[m]))
            System.out.println("Invalid Date");
        else {
            int count = 0;
            for (int i = 0; i < m - 1; i++) {
                count += days[i];
            }
            count += d;
            System.out.println("Number of Days = " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Date");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yy = sc.nextInt();

        CountDays obj = new CountDays(dd, mm, yy);
        obj.countdays();
    }
}
