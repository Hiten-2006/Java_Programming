public class EvenOrOddSwitch {
    public static void main(String[]args)
    {
        int a;
        a=18346;
        int result = a % 2;
        switch (result) {
            case 0:
            System.out.println("It is a Even Number");
            break;

            default:
            System.out.println("It is a odd number");
        }
    }
}
