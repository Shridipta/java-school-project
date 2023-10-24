import java.util.*;

public class Anagrams {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();
        System.out.println("String is:-"+str);
        System.out.println("Anagram of the given string is:-");
        int size = str.length();
        Anagrams a = new Anagrams();
        a.anagram(str, 0, size - 1);
    }
    void anagram(String str, int start, int end)
    {
        if (start == end)
            System.out.println(str);
        else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                anagram(str, start + 1, end);  // Used Recursion
                str = swap(str, start, i);  // Used Backtracking
            }
        }
    }
    String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}