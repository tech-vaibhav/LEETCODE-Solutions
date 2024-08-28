// Check whether a number is a BUZZ Number OR Not.
// A Buzz Number is a number which is divisible by 7 or it ends with 7.

__________________________________________________________:)

import java.util.Scanner;

public class BuzzNumber {
    public static boolean Buzz(int n) {
        return n % 10 == 7 || n % 7 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        if (Buzz(n)) {
            System.out.println(n + " is a BUZZ Number");
        } else {
            System.out.println(n + " is not a BUZZ Number");
        }
        sc.close();
    }
}
