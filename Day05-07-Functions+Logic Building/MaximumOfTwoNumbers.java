import java.util.Scanner;
public class MaximumOfTwoNumbers{
    public static void printMax(int a,int b)
    {
        if(a>b)
        System.out.println("Maximum Of two numbers is : "+a);
        else
        System.out.println("Maximum Of two numbers is : "+b);
        return;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        printMax(a, b);
    }
}