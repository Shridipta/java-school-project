import java.util.Scanner;

public class LuckyNumbers {
    int arr[], n;

    LuckyNumbers(int nn) {
        n = nn;
        arr = new int[n];
    }

    void display() {
        int i, k = 0, c = 2;
        for (i = 0; i < n; i++)
            arr[i] = i + 1;

        while (c <= n) {
            for (i = 0; i < n; i++)
                if ((i + 1) % c != 0)
                    arr[k++] = arr[i];
            n = k;
            c++;
            k = 0;
        }

        System.out.println("LUCKY NUMBERS ARE:");
        for (i = 0; i < n; i++)
            System.out.println(arr[i]);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N:");
        int n = sc.nextInt();
        LuckyNumbers obj = new LuckyNumbers(n);
        obj.display();
    }
}
