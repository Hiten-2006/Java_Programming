class VariableDemo {
    int instanceVar = 10;
    static int staticVar = 20;

    public void showVariables() {
        int localVar = 30;
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        VariableDemo obj1 = new VariableDemo();
        VariableDemo obj2 = new VariableDemo();

        System.out.println("Object 1:");
        obj1.showVariables();

        obj1.instanceVar = 100;
        VariableDemo.staticVar = 200;

        System.out.println("\nObject 2:");
        obj2.showVariables();

        System.out.println("\nAgain Object 1:");
        obj1.showVariables();
    }
}