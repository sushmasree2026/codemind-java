import java.util.*;
public class sum_of_series{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum=0;
        for(float i=1;i<=n;i++){
            sum=sum+(1/i);
        }
        System.out.printf("%.2f",sum);
    }
}