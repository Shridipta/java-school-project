import java.util.*;

public class Word {
    String s;
    int v, con;

    Word() {
        s = "";
        v = 0;
        con = 0;
    }

    boolean validity(String word) {
        int c = 0;
        StringTokenizer st = new StringTokenizer(word);
        int c1 = st.countTokens();
        String get_word = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                c++;
                if (c == (c1 - 1)) {
                    get_word = word.substring(i + 1, word.length() - 1);
                }
            }
        }
        String up = word.toUpperCase();
        if (get_word.charAt(get_word.length() - 1) == '.' || get_word.charAt(get_word.length() - 1) == ';')
            if (up.equals(word)) {
                return true;
            } else {
                return false;
            }
        else {
            return false;
        }
    }

    void count() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        s = sc.nextLine();
        s += " ";
        boolean ans = validity(s);
        if (ans) {
            StringTokenizer st = new StringTokenizer(s);
            String word = "";
            System.out.println("Word\tCount\t");
            while (st.hasMoreTokens()) {
                word = st.nextToken();
                for (int i = 0; i < word.length(); i++) {
                    if (Character.isAlphabetic(word.charAt(i))) {
                        if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I'
                                || word.charAt(i) == 'O' || word.charAt(i) == 'U') {
                            v++;
                        } else {
                            con++;
                        }
                    }
                }
                System.out.print(word + "\t\t");
                for (int j = 0; j < v; j++) {
                    System.out.print("V");
                }
                System.out.println();
                System.out.print("\t\t");
                for (int k = 0; k < con; k++) {
                    System.out.print("C");
                }
                System.out.println();
                v = 0;
                con = 0;
            }
        } else {
            System.out.println("Invalid Sentence");
        }
    }

    public static void main(String[] args) {
        Word obj = new Word();
        obj.count();
    }
}