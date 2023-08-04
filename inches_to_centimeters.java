import java.util.Scanner;
 public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        float number3;
        number1 = sc.nextInt();
        number3 = (float)number1 *2.54f;
        System.out.printf("%.2f",number3);
    }
    
}