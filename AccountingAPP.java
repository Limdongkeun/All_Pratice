package Pratice1;

public class AccountingAPP {

    public static double valueOfSupply = 10000.0; //공급가액

    public static double vatRate = 0.1; //부가가치세율

    public static  double getVAT(){  //부가세
        return valueOfSupply * vatRate;
    }

    public  static double getTOTAL(){ //합계
        return  valueOfSupply + getVAT();
    }

    public static void main(String[] args) {

//        double vat = getVAT(); //부가세 double vat = valueOfSupply * vatRate;
//
//        double total = getTOTAL(); //합계 double total = valueOfSupply + vat;

        System.out.println("Valur of supply: " + valueOfSupply);
        System.out.println("VAT: " + getVAT());
        System.out.println("Total: " + getTOTAL());
    }
}
