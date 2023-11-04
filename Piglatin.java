import java.util.*;

public class Piglatin {
    String sent;

    Piglatin() {
        sent = "";
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        sent = sc.nextLine();
    }

    String piglatin(String word) {
        word = word.toUpperCase();
        String piglatin = "";
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char x = word.charAt(i);
            if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
                piglatin = word.substring(i) + word.substring(0, i) + "AY";
                break;
            }
        }
        return piglatin;
    }

    void display() {
        StringTokenizer st = new StringTokenizer(sent);
        String w;
        String res = "";
        while (st.hasMoreTokens()) {
            w = st.nextToken();
            String ans = piglatin(w);
            res += ans + " ";
        }
        System.out.println("The new sentence is: " + res);
    }

    public static void main(String[] args) {
        Piglatin obj = new Piglatin();
        obj.accept();
        obj.display();
    }
}