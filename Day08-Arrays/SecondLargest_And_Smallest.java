import java.util.Scanner;
public class SecondLargest_And_Smallest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("No Of Elements : ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n<2){
            System.out.println("Atleast 2 Elements");
            sc.close();
            return;
        }
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }else if(arr[i]>secondmax&&arr[i]<max){
                secondmax=arr[i];
            }
            if(arr[i]<min){
                secondmin=min;
                min=arr[i];
            }else if(arr[i]<secondmin&&arr[i]>min){
                secondmin=arr[i];
            }
        }
        System.out.println("Second Largest : "+secondmax);
        System.out.println("Second Smallest ; "+secondmin);
        sc.close();
    }   
}
