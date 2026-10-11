// Approach 2 (moderate - Business Logic in same class as main())

import java.util.Scanner;

public class program34 {

    public int Addition(int iNo1, int iNo2)
    {
        int iAns = 0;

        iAns = iNo1 + iNo2;

        return iAns;
    }


    public static void main(String A[])
    {
        Scanner scanner = null;
        int iValue1 = 0, iValue2 = 0, iResult = 0;

        scanner = new Scanner(System.in);

        System.out.println("Enter first Number : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter second Numaber : ");
        iValue2 = scanner.nextInt();

        iResult = Addition(iValue1, iValue2);  // error: non-static method Addition(int,int) cannot be referenced from a static context

        System.out.println("Addition is : "+ iResult);

       
    }
}

