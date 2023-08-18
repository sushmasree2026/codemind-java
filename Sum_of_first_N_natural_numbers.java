import java.util.*;
public class sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,s=0,i;
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            s+=i;
        }
        System.out.println(s);
    }
}