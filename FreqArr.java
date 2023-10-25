import java.util.*;

public class FreqArr {
    String a[], b[];
    int m;
    FreqArr() {
        m = 0;
        a = new String[m];
        b = new String[m];
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        m = sc.nextInt();
        a = new String[m];
        b = new String[m];
        System.out.println("Enter the elements: ");
        for (int i = 0;i < m;i++) {
            a[i] = sc.next();
        }
    }
    int count(String element, String arr[]) {
        int count = 0;
        for (int i = 0;i < arr.length;i++) {
            if (element.equals(arr[i])){
                count++;
            }
        }
        return count;
    }
    void display() {
        int k = 0;

        for (int i = 0;i < m;i++) {
            String element = a[k];
            int c = count(element, a);
            k++;
            if (c == 1)
                System.out.println(element + " is present "+c+" time");
            else {
                b[i] = element;
                for (int j = 0;j < b.length;j++) {
                    if (b[j] != null) {
                        int c1 = count(b[j], b);
                        if (c1 == c){
                            System.out.println(b[j] + " is present "+c1+" times");
                            break;
                        }
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        FreqArr obj = new FreqArr();
        obj.accept();
        obj.display();
    }
}
