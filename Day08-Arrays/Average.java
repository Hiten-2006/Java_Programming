import java.util.Scanner;
public class Average {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("No Of Elements : ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        double average=(double)sum/n;
        System.out.println("Average of The Elements : "+average);
        sc.close();
    }
}
