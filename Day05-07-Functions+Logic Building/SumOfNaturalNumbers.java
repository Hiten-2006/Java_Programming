import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static int printSumOfNaturalNumbers(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            
            
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSumOfNaturalNumbers(n);
        sc.close();
    }
}
