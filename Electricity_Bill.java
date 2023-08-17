import java.util.*;
public class ele{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int a;
        float b;
        a = sc.nextInt();
        if(a<=199){
            b=(float)(a*1.20f);
            if(b>400){
                float sca=0.15f*b;
                b+=sca;
            }
            else b+=100;
            System.out.printf("%.2f",b);
        }
        else if(a>=200 && a<400){
            b =(float)(a*1.50f);
            if(b>400){
                float sca=0.15f*b;
                b+=sca;
            }
            else b+=100;
            System.out.printf("%.2f",b);
        }
        else if(a>=400 && a<600){
            b=(float)(a*1.80f);
            if(b>400){
                float sca=0.15f*b;
                b+=sca;
            }
            else b+=100;
            System.out.printf("%.2f",b);
        }
        else if(a>600){
            b=(float)(a*2.00f);
            if(b>400){
                float sca=0.15f*b;
                b+=sca;
            }
            else b+=100;
            System.out.printf("%.2f",b);
        }
    }
}