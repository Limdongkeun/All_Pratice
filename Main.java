package Pratice1;

class method{
    public static void numbering(int init, int limit){
        int i = init;
        while (i<limit){
            System.out.println(i);
            i++;
        }
    }
}
public class Main {
    public static void main(String[] args) {
//        method m = new method();
//        m.numbering(1,11);
          method.numbering(1,11);
    }
}