import java.util.Scanner;
public class RowWiseSum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("No Of Rows : ");
        int rows=sc.nextInt();
        System.out.print("No Of Columns : ");
        int columns=sc.nextInt();
        int[][]arr=new int[rows][columns];
        System.out.println("Enter Matrix Elements : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            int rowSum=0;
            for(int j=0;j<columns;j++){
                rowSum+=arr[i][j];
            }
            System.out.println("Sum of Row "+(i+1)+" = "+rowSum);
        }
        sc.close();

    }    
}
