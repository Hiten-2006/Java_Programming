import java.util.Scanner;
public class CountOccurences {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("No Of Elements : ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Search The Element Which You Want To Count : ");
        int a =sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                count++;
            }
           
        }
         if(count==0){
                System.out.println("Element Not Found");
            }
            else
            {
                System.out.println("Total Occurence Of The Element : "+count);
            }sc.close();
    }   
}
