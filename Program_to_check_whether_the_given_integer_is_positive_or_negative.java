import java.util.*;
public class posinega{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if(n<0){
            System.out.printf("Negative Number");
        }
        else{
            System.out.printf("Positive Number");
        }
    }
}