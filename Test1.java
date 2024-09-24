import java.util.*;

public class Test1 {
    int sum = 0;

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number");
        n = s.nextInt();
        Test1 obj = new Test1();
        int a = obj.sum_digit(n);
        System.out.println("Sum of digit is:" + a);
    }

    int sum_digit(int n) {
        sum += n % 10;
        if (n == 0) {
            return 0;
        } else {
            return sum_digit(n / 10);
        }
    }
}