import java.util.Scanner;
public class SumOfElements {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("No Of Rows : ");
        int rows=sc.nextInt();
        System.out.print("No Of Coulmns : ");
        int columns=sc.nextInt();
        int[][]arr=new int[rows][columns];
        int sum=0;
        System.out.println("Enter Matrix Elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum Of The Elements : "+sum);
        sc.close();
    }    
}
