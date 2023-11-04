import java.util.*;

public class HammingNumber {
    int num;
    Scanner sc = new Scanner(System.in);

    HammingNumber() {
        num = 0;
    }

    void accept() {
        System.out.println("Enter any number: ");
        num = sc.nextInt();
    }

    void isHamming() {
        if (num < 0)
            System.out.println("NEGATIVE NUMBER ENTERED. INVALID INPUT.");
        else {
            int flag = 0, copy = num;
            System.out.print(num + " = ");
            for (int i = 2; copy >= 0; i++) {
                if (copy % i == 0) {
                    System.out.print(i + " x ");
                    copy = copy / i;

                    if (i != 2 && i != 3 && i != 5) {
                        flag = 1;
                        break;
                    }

                    i--;
                }
            }
            if (flag == 0)
                System.out.println(num + "IS NOT A HAMMING NUMBER");
            else
                System.out.println(num + "IS A HAMMING NUMBER");
        }
    }

    public static void main(String[] args) {
        HammingNumber obj = new HammingNumber();
        obj.accept();
        obj.isHamming();
    }
}
