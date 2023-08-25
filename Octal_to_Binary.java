import java.util.Scanner;
public class convert{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            String a = sc.next();
            int oct = Integer.parseInt(a,8);
            String b = Integer.toBinaryString(oct);
            System.out.println(b+"");
        }
    }
}