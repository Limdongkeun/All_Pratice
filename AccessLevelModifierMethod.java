package Pratice1;

class Greeting{
    //public, protected, default,  private
    public static void hi(){
        System.out.println("hi");
    }
}

public class AccessLevelModifierMethod {
//    public, protected, default,  private
//    public static void hi(){
//        System.out.println("hi");
//    }
    public static void main(String[] args) {
        Greeting.hi();
    }
}
