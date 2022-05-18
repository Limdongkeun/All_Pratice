package Pratice1;

class cal{
    public int sum(int v1, int v2){
        return v1 + v2;
    }
    //overloading
    public int sum(int v1, int v2,int v3){
        return this.sum(v1,v2)+v3;
    }
}
class cal3 extends cal {
    public int minus(int v1, int v2) {
        return v1 - v2;
    }
//    overriding 상위클래스에 있는걸 가져와서 덮어쓰기( 같은 내용에 내용 추가)
    public int sum(int v1, int v2) {
        System.out.println("cal3!!");
        return super.sum(v1, v2);
    }
}


public class InheritanceAPP {
    public static void main(String[] args) {
        cal c = new cal();
        System.out.println(c.sum(1,5));
        System.out.println(c.sum(1,5,4));

        cal3 c3 = new cal3();

        System.out.println(c3.minus(3,4));
        System.out.println(c3.sum(3,4));
    }
}
//class cal2{
//    public int sum(int v1, int v2){
//        return v1 + v2;
//    }
//    public  int minu(int v1, int v2){
//        return  v1 - v2;
//    }
//}