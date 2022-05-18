package Pratice1;

public class Note{
    public static void main(String args[]) {
        Student st = new Student();
    }
}

class Human {
    Human() {
        System.out.println("휴먼 클래스 생성자");
    }

    Human(String str) {
        System.out.println("매개 변수를 받은 휴먼 클래스 생성자");
    }
}

class Student extends Human { // Human 클래스로부터 상속
    Student() {
        super("안녕"); // Human 클래스의 생성자 호출
        System.out.println("학생 클래스 생성자");
    }
}