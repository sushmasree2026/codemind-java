import java.util.*;
public class dcapacity{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t,s,b,c;
        t = sc.nextInt();
        s = sc.nextInt();
        b = sc.nextInt();
        c = t*b*s*512*2;
        System.out.println(c);
    }
}