package Pratice1;

class Foo{
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";

    public static void classMethod(){
        System.out.println(classVar); //ok
//        System.out.println(instanceVar); //error
    }

    public void setInstanceVar(){
        System.out.println(classVar); //ok
        System.out.println(instanceVar); //ok
    }
}
public class StaticAPP {
    public static void main(String[] args) {
        System.out.println(Foo.classVar); //ok
//        System.out.println(Foo.instaneVar; //error

        Foo.classMethod();
//        Foo.instanceMethod();

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classVar); // I class var
        System.out.println(f1.instanceVar); // I instance var

        f1.classVar = "change by f1";
        System.out.println(Foo.classVar); // change by f1
        System.out.println(f2.classVar); // change by f1

        f1.instanceVar = " change instance man";
        System.out.println(f1.instanceVar); // change instance man
        System.out.println(f2.instanceVar); // I instance var
    }
}
