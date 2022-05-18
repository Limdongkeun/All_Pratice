package Pratice1;

class Person1{
    public void say(){
        System.out.println("나는 사람이다");
    }

//    public void jjo() {
//    }
    public void go(){
        System.out.println("가자가자");
    }
}
class man extends Person1{
    @Override
    public void say() {
        System.out.println("나는 남자다");
    }
    public void jjo(){
        System.out.println("개발자다");
    }
}
class women extends Person1{
    @Override
    public void say() {
        super.say();
        System.out.println("그리고 나는 여자다");
    }
}

public class Po {
    public static void main(String[] args) {
        Person1 p = new Person1();
        man m = new man();
        women w = new women();

        p.say();
        m.say();
        w.say();
        System.out.println("===========================");

        Person1 p2 = new man();
        Person1 p3 = new women();

        p2.say();
        p2.go();
//        p2.jjo();
        p3.say();

//        man m2 = new Person1();
    }
}
