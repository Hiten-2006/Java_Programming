import java.util.Scanner;
public class ReverseNumber {    
    public static int printReverseNumbers(int n){
        int rev=0;
        while(n!=0){
            int lastdigit=n%10;
            rev=rev*10+lastdigit;
            n=n/10;
        }return rev;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n+": Reversed Number is:"+printReverseNumbers(n));
        sc.close();
    }
}
