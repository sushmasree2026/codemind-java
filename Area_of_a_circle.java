import java.util.Scanner;
public class areaofcir{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r;
        float ar;
        r = sc.nextInt();
        ar = r*r*3.14f;
        System.out.printf("%.2f",ar);
    }
}