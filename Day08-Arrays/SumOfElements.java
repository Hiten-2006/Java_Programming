import java.util.Scanner;
public class SumOfElements {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("No Of Elements To Add : ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum Of The Elements : "+sum);
        sc.close();
    }
}
