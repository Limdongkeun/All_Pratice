package Pratice1;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
    public static void main(String[] args) throws IOException {
        //class : System, Math, FileWriter
        //instance: f1, f2
        System.out.println(Math.PI);
        System.out.println(Math.floor(1.9));
        System.out.println(Math.ceil(1.9));

        FileWriter f1 = new FileWriter("data.txt");
        f1.write("hello");
        f1.write("java");
        f1.close();

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("hello");
        f2.write("java");
        f2.close();
    }
}
