//class Product{
//    int price;
//    int point;
//
//    Product(int price){
//        this.price = price;
//        point = (int)(price/10.0);
//    }
//
//    public Product() {}
//}
//
//class Tv extends Product{
//    Tv{
//        super(price);
//    }
//    public String toString(){
//        return Tv;
//    }
//}
//
//class Computer extends Product{
//    Computer{
//        super(100);
//    }
//    public String toString(){return Computer;}
//}
//
//class Macbook extends Product{
//    Macbook{
//        super(150);
//    }
//    public String toString(){return Macbook;}
//}
//
//class Buyer{
//     int money = (int) 10000.0;
//     int point = 0;
//
//     void buy(Product p){
//         if(money < p.price){
//             System.out.println("돈이 부족합니다");
//         } else{
//             money = money - p.price;
//             point = point + p.point;
//             System.out.println(p.toString() + " 을 구입했습니다 ");
//         }
//     }
//
//}
//public class MyProductTest {
//    public static void main(String[] args) {
//        Buyer b = new Buyer();
//        Product p = new Product();
//        Tv t = new Tv();
//        Computer c = new Computer();
//        Macbook m = new Macbook();
//    }
//}
