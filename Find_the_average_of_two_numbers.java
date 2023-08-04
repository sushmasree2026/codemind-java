import java.util.Scanner;
public class avg2Nums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        float c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = (float) (a+b)*0.5f;
        System.out.printf("%.4f",c);
    }
}