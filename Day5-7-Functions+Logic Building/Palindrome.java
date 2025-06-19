import java.util.Scanner;
public class Palindrome {
    public static void printPalindrome(int n){
        int rev=0;
        int original=n;
        while(n!=0){
            int lastdigit=n%10;
            rev=rev*10+lastdigit;
            n=n/10;
        }
        
        if (rev==original)
        System.out.println("Number is palindrome");
        else
        System.out.println("Number is Not a Palindrome");
        
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPalindrome(n);
        sc.close();
    }
}
