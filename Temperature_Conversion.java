import java.util.Scanner;
public class tempconvo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c;
        float f;
        c = sc.nextInt();
        f = (float) 32 + (c*1.8f);
        System.out.printf("%.2f",f);
    }
}