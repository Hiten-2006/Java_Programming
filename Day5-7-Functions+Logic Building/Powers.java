import java.util.Scanner;
public class Powers {
    public static void printPowerOfGivenTwoNumbers(int a,int b)
    {
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Power of "+a+" and "+b+" is :"+result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        printPowerOfGivenTwoNumbers(a, b);
        sc.close();
    }   
}
