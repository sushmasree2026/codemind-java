import java.util.*;
public class Unique{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int f=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        c+=1;
                    }
                }
            }
            if(c==0){
                f=1;
                System.out.printf("%d ",arr[i]);
            }
        }
        if(f==0){
            System.out.print("-1");
        }
    }
}