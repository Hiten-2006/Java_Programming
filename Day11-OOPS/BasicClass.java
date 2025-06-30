class Student{
    String name;
    int age;

void display(){
    System.out.println(name+" is "+age+" years old.");
    }
}
public class BasicClass{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Hiten";
        s1.age=18;
        s1.display();
    }
}