import java.util.*;
public class cars{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int x1,x2,y1,y2;
            x1=sc.nextInt();
            x2=sc.nextInt();
            y1=sc.nextInt();
            y2=sc.nextInt();
            if((float)y1/x1 < (float)y2/x2){
                System.out.printf("-1
");
            }
            else if((float)y1/x1 > (float)y2/x2){
                System.out.printf("1
");
            }
            else{
                System.out.printf("0
");
            }
        }
    }
}