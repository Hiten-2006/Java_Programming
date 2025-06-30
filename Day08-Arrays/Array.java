import java.util.Scanner;
public class Array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Print Size Of Array : ");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        
        
        for(int i=0;i<size;i++){
            System.out.print("Next Value Of Array : ");
            numbers[i]=sc.nextInt();
            
        }
        System.out.println("Array Values Stored : ");
        for(int i=0;i<numbers.length;i++){
            
            System.out.println(numbers[i]);
        }
        
        sc.close();
    }
}
