import java.util.*;

public class CircularPrime {
    int n;

    CircularPrime() {
        n = 0;
    }

    int round(int x) {
        String res = "", tmp = "";
        tmp = Integer.toString(x);
        res = tmp.substring(1) + tmp.charAt(0);
        return Integer.parseInt(res);
    }

    boolean checkPrime(int x) {
        int c = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0)
                c++;
        }
        if (c == 2)
            return true;
        else
            return false;
    }

    void check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        int cp = n, c = 0, length = Integer.toString(n).length();
        while (cp > 0) {
            int dig = cp % 10;
            if (c == length) {
                break;
            } else {
                c++;
            }
            cp = cp / 10;
        }

        boolean res = false;
        int tmp = n;
        res = checkPrime(tmp);
        for (int i = 0; i < c; i++) {
            int ans = round(tmp);
            tmp = ans;
            ans = n;
        }
        if (res == false)
            System.out.println("Not a Circular Prime");
        else
            System.out.println("A Circular Prime Number");
    }

    public static void main(String[] args) {
        CircularPrime obj = new CircularPrime();
        obj.check();
    }
}
