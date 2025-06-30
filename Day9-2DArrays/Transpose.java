import java.util.Scanner;
public class Transpose {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("No Of Rows : ");
        int rows=sc.nextInt();
        System.out.print("No Of Columns : ");
        int columns=sc.nextInt();
        int[][]arr=new int[rows][columns];
        System.out.println("Enter The Elements : ");
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
        for(int j=0;j<columns;j++){
            for(int i=0;i<rows;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }    
}

