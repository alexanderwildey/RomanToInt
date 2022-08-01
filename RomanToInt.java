import java.util.Scanner;

public class RomanToInt {

    public static int solution(String s) {

        int len = s.length();
        int total = 0;
        char[] ch = s.toCharArray();

        for (int i = 0; i < len; i++) {
            switch (ch[i]) {
                case 'M':
                    total += 1000;
                    break;
                case 'D':
                    total += 500;
                    break;
                case 'C':
                    if ((i + 1 != len) && (ch[i + 1] == 'D')) {
                        total += 400;
                        i += 1;
                    } else if ((i + 1 != len) && (ch[i + 1] == 'M')) {
                        total += 900;
                        i += 1;
                    } else {
                        total += 100;
                    }
                    break;
                case 'L':
                    total += 50;
                    break;
                case 'X':
                    if ((i + 1 != len) && (ch[i + 1] == 'L')) {
                        total += 40;
                        i += 1;
                    } else if ((i + 1 != len) && (ch[i + 1] == 'C')) {
                        total += 90;
                        i += 1;
                    } else {
                        total += 10;
                    }
                    break;
                case 'V':
                    total += 5;
                    break;
                case 'I':
                    if ((i + 1 != len) && (ch[i + 1] == 'V')) {
                        total += 4;
                        i += 1;
                    } else if ((i + 1 != len) && (ch[i + 1] == 'X')) {
                        total += 9;
                        i += 1;
                    } else {
                        total += 1;
                    }
                    break;
            }
        }

        return total;
    }

    // Verify that the user has only entered valid characters for a number in roman numerals.
    public static boolean checkString(String s) {

        if (!s.matches("[MDCLXVI]+")) {
            return false;
        }
        else {
            return true;
        }

    }

    public static void main(String[] args) {

        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number using the Roman numerals M, D, C, L, X, V, and/or I.");

        String s = input.nextLine();
        s = s.toUpperCase();

        boolean validString = checkString(s);

        if(validString) {
            total = solution(s);
            System.out.println(String.format("The answer is: %d", total));
        }
        else {
            System.out.println("ERROR! Inputted number contains invalid numerals, please try again.");
        }

        input.close();
    }
}
