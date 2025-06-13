public class SimpleCalculator {
    public static void main(String[]args)
    {
        double a,b;
        a=9;
        b=18;
        char operator='-';
        switch(operator)
        {
            case'+':
            System.out.println(a+b);
            break;

            case'-':
            System.out.println(a-b);
            break;

            case'/':
            System.out.println(a/b);
            break;

            case'*':
            System.out.println(a*b);
            break;
        }
    }
}
