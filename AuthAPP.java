package Pratice1;

public class AuthAPP {
    public static void main(String[] args) {
//        System.out.println(args[0]);

        String id = "egoing";
        String inputId = args[0];

        String pass = "1111";
        String inputPass = args[1];

//        System.out.println(args[1]);

//        System.out.println("Hi");

//        if(inputId.equals(id)){   //String은 .equals()로 같은지 확인 해야한다
//            if(inputPass.equals(pass)){
//                System.out.println("Hello master");
//            }else {
//                System.out.println("Wrong pass");
//            }
//        }else {
//            System.out.println("Who are you");
        if(inputId.equals(id) && inputPass.equals(pass)){
            System.out.println("Hi master");
        } else {
            System.out.println("Fuck");
        }
    }
}
