class UnaryDemo{
    public static void main(String[]args)
    {
        int a,b,c,d,ra,rb,rc,rd;
        a=b=c=d=5;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println();
        ra=a++;
        rb=++b;
        rc=c--;
        rd=--d;
        System.out.println("ra="+ra);
        System.out.println("rb="+rb);
        System.out.println("rc="+rc);
        System.out.println("rd="+rd);

    }
}