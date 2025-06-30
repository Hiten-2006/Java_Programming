import java.util.Scanner;
public class ColumnWiseSum {
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);
            System.out.print("No Of Rows : ");
            int rows=sc.nextInt();
            System.out.print("No Of Columns : ");
            int columns=sc.nextInt();
            int[][]arr=new int[rows][columns];
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int j=0;j<columns;j++){
                int columnsum=0;
                for(int i=0;i<rows;i++){
                    columnsum+=arr[i][j];
                }
                System.out.println("Sum of Column "+(j+1)+" = "+columnsum);
            }
            sc.close();
        }
}
