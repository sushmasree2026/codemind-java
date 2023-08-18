import java.util.*;
public class table{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n,m,i;
        n = sc.nextInt();
        m = sc.nextInt();
        for(i=1;i<=m;i++){
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
    }
}