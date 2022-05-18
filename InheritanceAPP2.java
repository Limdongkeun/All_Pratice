package Pratice1;

class cal2{
    int v1,v2;
    cal2(int v1, int v2){
        System.out.println("cal init!");
        this.v1 = v1; this.v2 =v2;
    }
    public int sum(){return this.v1+v2;}
}
class cal4 extends cal2 {

    cal4(int v1, int v2) {
        super(v1, v2); //super는 상위 클래스
        System.out.println("cal3 init!!!");
    }
    public int minus(){return this.v1-v2;}
}
public class InheritanceAPP2 {
    public static void main(String[] args) {
//        cal c = new cal(5,2);
        cal4 c4 = new cal4(3,4);
        System.out.println(c4.sum()); //7
        System.out.println(c4.minus()); // -1

    }
}
