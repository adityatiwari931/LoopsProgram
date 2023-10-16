package Loop;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range :");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
//                    System.out.println(num + " Is not a prime ");
                    break;
                } else {
                    System.out.println(i + " Is prime");
                    break;
                }

            }
        }
    }
}
