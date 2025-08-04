class Pen{
    String colour;
    String type;
    public void write(){
        System.out.println("Writing Something");
    }
    public void printcolour(){
        System.out.println(colour);
    }
}
public class OOPS {
    public static void main(String[]args){
        Pen pen1=new Pen();
        pen1.colour="blue";
        pen1.type="gel";

        Pen pen2=new Pen();
        pen2.colour="black";
        pen2.type="ballpoint";

        pen1.write(); 
        pen2.write();
        pen1.printcolour();
        pen2.printcolour();
    }
}
