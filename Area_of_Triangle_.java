import java.util.Scanner;
public class areaoftri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        float s,ar;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = (float)(a+b+c)*0.5f;
        ar = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",ar);
    }
}
