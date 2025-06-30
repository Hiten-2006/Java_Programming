public class CalculatorUsingIntMenuChoice {
    public static void main(String[]args)
    {
        int choice=4;
        int a = 216;
        int b = 108;
        switch (choice){
            case 1:
            System.out.println("Addition: "+(a+b));
            break;

            case 2:
            System.out.println("Substraction "+(a-b));
            break;

            case 3:
            System.out.println("Multiplication: "+(a*b));
            break;

            case 4:
            if (b!=0)
            System.out.println("Division:"+(a/b));
            else
            System.out.println("Error Division!");
            break;
        }
    }
}
