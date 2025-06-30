import java.util.Scanner;
public class LinearSearch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("No Of Elements : ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Search The Element : ");
        int a=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                System.out.println("Found At Index : "+i);
                sc.close();
                return;
            }            
        }
        System.out.println("Not Found");
        sc.close();
        
    }   
}
