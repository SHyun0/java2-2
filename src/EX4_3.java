public class EX4_3 {
    int radius;
    String name;
    
    public EX4_3(){
    radius = 1; name= "";
    }
    public EX4_3(int r, String n){
        radius = r; name = n;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
public static void main(String[] args) {
    EX4_3 pizza = new EX4_3(10, "자바피자");
    double area = pizza.getArea();
    System.out.println(pizza.name + "의 면적은" + area);

    EX4_3 dount = new EX4_3();
    dount.name = "도넛피자";
    area = dount.getArea();
    System.out.println(dount.name + "의 면적은" + area);
}
}
