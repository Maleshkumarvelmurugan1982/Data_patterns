import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int k = 0; k < n; k++) {
            System.out.print("Enter line: ");
            String s = sc.nextLine();
            int[] freq = new int[128];
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if ((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z')) {
                    freq[ch]++;
                }
            }
            int max = 0;
            for (int i = 0; i < 128; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                }
            }
            System.out.print("Output: ");
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                if (freq[ch] == max) {
                    System.out.print(ch);
                }
            }
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (freq[ch] == max) {
                    System.out.print(ch);
                }
            }
        }
    }
}
