import java.util.Scanner;
public class CircumferenceOfCircle {
    public static void printCircumferenceOfCircle(double n){
        double circumference=2*3.14*n;
        System.out.println("Circumference of Circle :"+circumference);
    }
    public static void main(String[]args)
    {
        Scanner  sc=new Scanner(System.in);
        double n=sc.nextDouble();
        sc.close();
        printCircumferenceOfCircle(n);
    }
}
