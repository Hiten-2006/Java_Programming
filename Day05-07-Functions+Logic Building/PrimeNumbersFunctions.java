import java.util.Scanner;
public class PrimeNumbersFunctions {
    public static void printPrime(int n){

        {
            if(n<=1)
            System.out.print("Prime Numbers should be greater than 1");
            for(int i=2;i<=n/2;i++){
                if(n % i ==0){
                    System.out.println("Not a Prime Number");
                    return;
                }
            }
            System.out.println("Prime Number");
            
        }        
    }public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        sc.close();
        printPrime(n);
    }
} 
