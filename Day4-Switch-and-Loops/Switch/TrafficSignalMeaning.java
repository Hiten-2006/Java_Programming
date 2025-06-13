public class TrafficSignalMeaning {
    public static void main(String[]args)
    {
        String ch="Green";
        switch(ch)
        {
            case"Red":
            System.out.println("Stop");
            break;

            case"Yellow":
            System.out.println("Get Ready To Move");
            break;

            case"Green":
            System.out.println("Go");
            break;

            default:
            System.out.println("Invalid Signal");
        }
    }
}
