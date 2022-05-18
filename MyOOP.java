package Pratice1;

public class MyOOP {
    public static void main(String[] args) {
        delimiter ="-----";
        PrintA();
        //....
        PrintA();

        delimiter = "*****";
        PrintB();
        //....
        PrintB();

    }
    public static String delimiter = "";
    public static void PrintA() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    public static void PrintB() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
