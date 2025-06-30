import java.util.Scanner;
public class EvenOrOddFunction{
    public static void checkEvenOdd(int a)
    {
        if(a%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        
        sc.close();
        checkEvenOdd(a);
    }
}