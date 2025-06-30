import java.util.Scanner;
public class A_And_D_Order {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("No Of Elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Ascending Order : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.print("\nDescending Order : ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
