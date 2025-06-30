import java.util.Scanner;
public class Gcd {
    public static int findGCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }return a;
    }
    public static void printCommonDivisors(int a,int b){
        int gcd=findGCD(a,b);
        for(int i=1;i<=gcd;i++){
            if(gcd%i==0){
                System.out.print(i+" ");
            }
        }
    }   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        printCommonDivisors(a, b);
    }
}
