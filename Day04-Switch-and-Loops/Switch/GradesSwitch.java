public class GradesSwitch {
    public static void main(String[]args)
    {
        char grade='E';
        switch(grade)
        {
            case'A':
            System.out.println("Excellent");
            break;

            case'B':
            System.out.println("Vergood");
            break;

            case'C':
            System.out.println("Good");
            break;

            case'D':
            System.out.println("BetterLuckNextTime");
            break;

            case'E':
            System.out.println("Fair");
            break;

            case'F':
            System.out.println("Fail");
            break;

            default:
            System.out.println("Check Your Grade Again");
        }
    }
}
