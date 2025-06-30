import java.util.Scanner;
public class SecondLargest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No Of Elements :");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();  
        }
        int first=0;
        int second=0;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
                }
            else if(arr[i]>second&&arr[i]!=first){
                second=arr[i];
            }
        } if(second==0){
                System.out.println("All Values Maybe Same");
            }else{
                System.out.println("Second Largest Element : "+second);
            }
            sc.close(); 
    }
}
