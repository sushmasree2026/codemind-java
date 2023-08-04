import java.util.Scanner;
public class multi2numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = (float)a*b;
        System.out.printf("%.2f",c);
    }
}