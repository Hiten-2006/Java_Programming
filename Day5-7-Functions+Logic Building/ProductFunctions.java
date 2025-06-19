import java.util.Scanner;
public class ProductFunctions {
    public static int calculateProduct(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int product=calculateProduct(a, b);
        System.out.println("Product:"+product);
    }
}
