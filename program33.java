// Approach 1 (Worst - Business Logic in main())

import java.util.Scanner;

public class program33 {
    public static void main(String A[])
    {
        Scanner scanner = null;
        int iValue1 = 0, iValue2 = 0, iResult = 0;

        scanner = new Scanner(System.in);

        System.out.println("Enter first Number : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter second Numaber : ");
        iValue2 = scanner.nextInt();

        iResult = iValue1 + iValue2;  // Business Logic

        System.out.println("Addition is : "+ iResult);

       
    }
}

