package Pratice1;//static - class method
//no static - instance method

class PrintQ{
    public String delimiter;

    public void a(){ //a는 인스턴스의 소속이 된것
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }

    public void b(){
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }

    public static void c(String delimiter){
        System.out.println(delimiter);
        System.out.println("c");
        System.out.println("c");
    }
    public static void d(String delimiter){
        System.out.println(delimiter);
        System.out.println("d");
        System.out.println("d");
    }
}
public class staticMethod {

    public static void main(String[] args) {
//        Print.a("+");
//        Print.b("+");
        //instance 메서드가 인스턴스의 소속일때는 static을 붙이면 안됌
        // a,b는 Print class의 p1인스턴스를 상속받는것
        PrintQ p1 = new PrintQ();
        p1.delimiter = "+";
        p1.a();
        p1.b();


        //c,d는 Print 클래스를 상속받는것
        PrintQ.c("*");
        PrintQ.d("%");
//        Print p2 = new Print();
//        p2.delimiter = "+";
//        p2.a();
//        p2.b();
    }
}
