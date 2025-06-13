public class SwitchDemo {
    public static void main(String[]args)
    {
        String day = "mon";
        switch(day)
        {
            case"mon":
            System.out.println("Today Is Monday");
            break;
            case"tues":
            System.out.println("Today Is Tuesday");
            break;
            case"wed":
            System.out.println("Today Is Wednesday");
            break;
            case"thurs":
            System.out.println("Today Is Thursday");
            break;
            case"fri":
            System.out.println("Today Is Friday");
            break;
            case"sat":
            System.out.println("Today Is Saturday");
            break;
            case"sun":
            System.out.println("Today Is Sunday");
            break;
            default:
            System.out.println("day is invalid");
        }
    }
}
