import java.util.Scanner;
public class YourName{
    public static void printYourName(String name){
        System.out.println(name);
        return;
    }
    
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        sc.close();
        printYourName(name);
        
    }
}