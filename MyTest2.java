package Pratice1;

interface VehicleInterface {	// VehicleInterface 인터페이스 정의
    public abstract void ride(boolean on);
    public abstract void run();
    // void speedUp(int speed);	// 코드가 길어져서 미구현
    // void speedDown(int speed);	// 코드가 길어져서 미구현
    // void stop();	// 코드가 길어져서 미구현
}

// VehicleInterface 인터페이스를 상속받으면서 ride() 메서드만 구현하고 run() 메서드는 미구현이므로 추상화 클래스로 정의된다.
abstract class Vehicle implements VehicleInterface  {
    public String category;	// 일반 인스턴스 변수 정의

    public Vehicle() {	// 기본 생성자(default constructor) 정의
        category = "탈것";
    }

    public Vehicle(String category) {	// 생성자 오버로딩(constructor overloading)
        this.category = category;
    }


    public void showCategory() {	// 일반 메서드 정의
        System.out.println("카테고리 : " + category);
    }

    @Override
    public void ride(boolean on) {	// VehicleInterface 인터페이스의 ride() 메서드 오버라이딩
        if(on)
            System.out.println(category + "에 탑승합니다.");
        else
            System.out.println(category + "에서 내립니다.");
    }
}

class Cart extends Vehicle {	// Vehicle 추상화 클래스를 확장하는 Car 클래스 정의
    public Cart() {	// 기본 생성자 정의
        super("자동차");	// 상위 클래스의 생성자 호출
    }

    @Override
    public void run() {	// VehicleInterface 인터페이스의 run() 메서드 오버라이딩
        System.out.println("자동차에 시동을 걸고 출발합니다.");
    }
}

class Bike extends Vehicle {	// Vehicle 추상화 클래스를 확장하는 Bike 클래스 정의
    public Bike() {	// 기본 생성자 정의
        super("자전거");	// 상위 클래스의 생성자 호출
    }

    @Override
    public void run() {	// VehicleInterface 인터페이스의 run() 메서드 오버라이딩
        System.out.println("자전거 페달을 밟으며 출발합니다.");
    }
}

public class MyTest2 {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Bike bike = new Bike();
        Vehicle[] v_arr = { new Cart(), new Bike() };	// 배열을 이용한 다형화

        cart.showCategory();
        bike.showCategory();
        System.out.println();	// 한줄 띄우기 - 출력의 가독성 때문에 넣었을 뿐입니다.

        cart.ride(true);
        bike.ride(false);
        System.out.println();	// 한줄 띄우기 - 출력의 가독성 때문에 넣었을 뿐입니다.

        for(Vehicle v : v_arr) {	// 배열의 멤버를 전부 돌면서 반복 실행
            v.showCategory();
            v.ride(true);
            v.run();
            System.out.println();	// 한줄 띄우기 - 출력의 가독성 때문에 넣었을 뿐입니다.
        }
    }
}
