import java.util.*;
public class table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,n,i;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        for(i=a;i<=b;i++){
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
    }
}