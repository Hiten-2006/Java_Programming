import java.util.Scanner;
public class Max {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Number Of Elements : ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter The Value OF "+i+" Element : ");
            arr[i]=sc.nextInt();
            }
        int max =arr[0];
            for(int i=1;i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
        }System.out.println("Maximum Element : "+max);
        sc.close();
    }
}
