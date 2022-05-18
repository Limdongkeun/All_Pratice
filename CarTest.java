package Pratice1;

public class CarTest {
    public static void main(String[] args) {
        car1 emptyCar = new car1("g바겐","검은색",false);
        Car mustang = new Car("머스탱 쿠페");
        Car porche = new Car("포르쉐 카이맨", "실버", true);
        Car por = new Car("포르쉐 카이맨", "실버", true);



        System.out.println("내 차의 모델은 " + emptyCar.model + "이고 " + "색은 " + emptyCar.color + "입니다." + emptyCar.isConvertible);
        System.out.println("내 차의 모델은 " + mustang.model + "이고 " + "색은 " + mustang.color + "입니다.");
        System.out.println("내 차의 모델은 " + por.model + "이고 " + "색은 " + por.color + "입니다.");
        System.out.println("내 차의 모델은 " + por.model + "이고 " + "색은 " + por.color + "입니다.");

        System.out.println("포르쉐 카이먼은 뚜껑이 있다? " + porche.isConvertible );

        porche.power();
        porche.accelerate();
        porche.stop();
        Car.power();
    }
}

class Car {
    //속성
    public String model;
    public String color;
    public boolean isConvertible;


    //기본생성자 -> 만약에 아래 생성자가 하나도 없을 때
//    Car(){};

    // 매개변수가 없는 생성자
    Car() {
        System.out.println("매개변수가 없는 생성자 호출!");
    }

    // 매개변수가 있음 -> 1개
    Car(String model) {
        this(model, "레드", false);
    }

    // this() vs this.
    //매개변수 있음 -> 3개
    Car(String model, String color, boolean isConvertible) {
        this.model = model;
        this.color = color;
        this.isConvertible = isConvertible;
    }


    static void power() {
        System.out.println("시동을 걸었습니다.");
    }

    void accelerate() {
        System.out.println("더 빠르게!!");
    }

    void stop(){
        System.out.println("정지..");
    }
}
class car1 extends Car{
    car1(String model, String color, boolean isConvertible) {
        this.model = model;
        this.color = color;
        this.isConvertible = isConvertible;
    }
}