import java.util.Scanner;
public class arperi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r;
        float per,ar;
        r = sc.nextInt();
        per = 2*r*3.14f;
        ar = r*r*3.14f;
        System.out.printf("%.2f
",ar);
        System.out.printf("%.2f",per);
    }
}