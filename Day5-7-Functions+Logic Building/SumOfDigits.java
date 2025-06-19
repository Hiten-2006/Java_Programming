import java.util.Scanner;
public class SumOfDigits {
    public static int printSumOfDigit(int n){
        int sum=0;
        while(n!=0){
            int lastdigit=n%10;
            sum+=lastdigit;
            n=n/10;
            
        }return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum Of Digits :"+n+"is equal to:"+printSumOfDigit(n));
        sc.close();
    }
}
