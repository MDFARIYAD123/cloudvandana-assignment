import java.util.Scanner;

public class AnagramCheck {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26]; 

        for (char c : s1.toLowerCase().toCharArray()) {
            freq[c - 'a']++;  
        }

        for (char c : s2.toLowerCase().toCharArray()) {
            freq[c - 'a']--;  
        }

        for (int count : freq) {  
            if (count != 0) return false; 
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1 = scanner.next();
        String s2 = scanner.next();
        scanner.close();

        System.out.println(isAnagram(s1, s2));
    }
}
