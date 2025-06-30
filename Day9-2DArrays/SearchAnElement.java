import java.util.Scanner;
public class SearchAnElement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("No Of Rows : ");
        int rows=sc.nextInt();
        System.out.print("No Of Columns : ");
        int columns=sc.nextInt();
        int [][]arr=new int[rows][columns];
        System.out.println("Enter The Elements : ");
        for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter The Number To Search : ");
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(arr[i][j]==n){
                    System.out.println("Found At ["+i+"]["+j+"]");
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("Element Not Found");
        }
        sc.close();
    }    
}
