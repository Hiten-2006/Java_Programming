import java.util.Scanner;
public class Basic {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int rows=sc.nextInt();
        System.out.print("Enter Columns : ");
        int columns=sc.nextInt();
        int [][]arr=new int[rows][columns];
        System.out.println("Enter Elements : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
