package Pratice1;

public class WhyMethod {

    public static String twoTimes(String text, String delimiter) {
        String out ="";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;
    }
                                     //매개변수, parameter
    public static void printTwoTimesA(String text, String delimiter){
        System.out.println(text);
        System.out.println(delimiter);
    }
//    private static void printOneTimesA() {
//        System.out.println("aaa");
//        System.out.println("bbb");
//        System.out.println("aaa");
//    }
    public static void main(String[] args) {
                        //인자, argument
        printTwoTimesA("a", "+");

        printTwoTimesA("a", "*");

        System.out.println(twoTimes("lucky","doo"));
    }


}
