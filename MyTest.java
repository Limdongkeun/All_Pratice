package Pratice1;

class Person{ // Person class를 만든다
    String name; // 매개변수로 받는 것들을 선언해준다
    String job;
    int age;
    String address;

    public Person(String name, String job, int age, String address){
        this.name =name;  //인자로 들어온게 this.name을 써서 매개변수한테 알려준다
        this.job =job;
        this.age = age;
        this.address = address;

    }
    void eat() { //instance의 메서드니까 static없이 쓴다
            System.out.println("밥을 먹고");
    }
    void money() {
        System.out.println("돈을 벌고");
    }
    void flex(){
        System.out.println("다 써버리고");
    }

    //private을 만드니까 생긴 생성자
    public Person() {}
    //
    private String nameSet;
    private int ageSet;
    private String jobSet;

    public String getName() {
        return nameSet;
    }
    public void setName(String nameSet) {
        this.nameSet = nameSet;
    }
    public int getAge() {
        return ageSet;
    }
    public void setAge(int ageSet) {
        this.ageSet = ageSet;
    }
    public String getJob() {
        return jobSet;
    }
    public void setJob(String jobSet) {
        this.jobSet = jobSet;
    }
}

//Person class를 상속받아서 만든 금쪽이 class
class theGoldSide extends Person{

    public theGoldSide(String name, String job, int age, String address) {
        super(name, job, age, address); // 상위클래스의 생성자를 호출

        }
    static void talk(){ // 그냥 한 번 클래스의 메서드로 만들어 봤다 그래서 static를 넣어야 한다
        System.out.println("말을 잘 듣자");
    }
}

public class MyTest {
    public static void main(String[] args) {

        //Person class로 만든 생성자
        Person boss = new Person("youngsuck", "police", 55, "yongin");
        Person mom = new Person("sunok", "businessman", 53, "yongin");

        //Person class 호출
        System.out.println("이름은 "+boss.name + "직업은 " +boss.job + "나이는 "+boss.age + "살 " + "사는 곳은 " +boss.address);
        System.out.println("이름은 "+mom.name + "직업은 " +mom.job + "나이는 "+mom.age + "살 " + "사는 곳은 " +mom.address);

        //클래스 메서드
        theGoldSide.talk();

        //금쪽이 class로 만든 생성자
        theGoldSide lim = new theGoldSide("dongkeun","programmer", 27, "seoul");
        theGoldSide sim = new theGoldSide("younghae","ot",26,"inchon");
        theGoldSide son = new theGoldSide("jeounyun","ogm",39,"seoul");
        theGoldSide ga = new theGoldSide("gahee","pm",29,"yongin");

        //person class를 상속받은 theGoldSide class 호출
        System.out.println("이름은 "+lim.name + "직업은 " +lim.job + "나이는 "+lim.age + "살 " + "사는 곳은 " +lim.address);
        System.out.println("이름은 "+sim.name + "직업은 " +sim.job + "나이는 "+sim.age + "살 " + "사는 곳은 " +sim.address);
        System.out.println("이름은 "+son.name + "직업은 " +son.job + "나이는 "+son.age + "살 " + "사는 곳은 " +son.address);
        System.out.println("이름은 "+ga.name + "직업은 " +ga.job + "나이는 "+ga.age + "살 " + "사는 곳은 " +ga.address);

        //instance 메서드
        lim.eat();
        lim.money();
        lim.flex();

        //Person class에서 private으로 만들어서 가져오기
        Person grandfather = new Person();
        grandfather.setName("임주섭");
        grandfather.setJob("farmer");
        grandfather.setAge(79);

        System.out.println("이름은 "+ grandfather.getName() + " 직업은 " + grandfather.getJob() +" 나이는 " + grandfather.getAge()+"세");


    }
}
