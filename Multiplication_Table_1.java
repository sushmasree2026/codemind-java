import java.util.*;
public class table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,i;
        n = sc.nextInt();
        for(i=1;i<=12;i++){
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
    }
}