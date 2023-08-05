import java.util.*;
public class cars{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        float x;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        x  = sc.nextFloat();
        if(n1>n2){
            System.out.printf("-1");
        }
        else{
            int c = 1,s1=n1,s2=n2;
            while(x+s1>=s2)
            {
                c++;
                s1+=n1;
                s2+=n2;
            }
            System.out.println(c);
        }
    }
}