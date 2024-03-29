import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.print("월(1~12)을 입력하시오:");
int month = scanner.nextInt();

if (month >= 3 && month <= 5){
    System.out.println("봄 입니다");
}if (month >= 6 && month <= 8){
    System.out.println("여름 입니다");
}if (month >= 9 && month <= 11){
    System.out.println("가을 입니다");
}else{
    System.out.println("겨울 입니다");
}

scanner.close();
    }
}