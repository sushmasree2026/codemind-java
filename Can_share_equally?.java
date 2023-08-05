import java.util.*;
public class share{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a%2==0 && (a>0 || b%2==0)){
            System.out.printf("YES");
        }
        else{
            System.out.printf("NO");
        }
    }
}