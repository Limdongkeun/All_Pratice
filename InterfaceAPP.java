package Pratice1;

interface Calculable{
    double PI =3.14;
    int sum(int v1, int v2);
}
interface Printable{
    void print();
}
class RealCal implements Calculable, Printable {
    @Override
    public int sum(int v1, int v2) {
        return v1 + v2;
    }
    @Override
    public void print() {
        System.out.println("This is RealCal!");
    }
}
class AdvencedPrint implements  Printable {
    @Override
    public void print() {
        System.out.println("This is RealCal!");
    }
}
//class DummyCal implements Calculable{
//    @Override
//    public int sum(int v1, int v2) {
//        return 3;
//    }
//}

public class InterfaceAPP {
    public static void main(String[] args) {
        //더하기 기능이 있는 클래스를 만들어 주세요
        RealCal c = new RealCal();
        System.out.println(c.sum(2,3));
        c.print();
        System.out.println(c.PI);

        System.out.println("----------------------");
        Calculable b = new RealCal();
        System.out.println(b.sum(2,6));
        System.out.println("----------------------");

        Printable f = new RealCal();
        f.print();
        System.out.println("----------------------");

        Printable g = new AdvencedPrint();
        g.print();
    }
}
