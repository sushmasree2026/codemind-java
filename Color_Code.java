import java.util.*;
public class colorCode{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch=='v'||ch=='V'){
            System.out.printf("Violet");
        }
        else if(ch=='i'||ch=='I'){
            System.out.printf("Indigo");
        }
        else if(ch=='b'||ch=='B'){
            System.out.printf("Blue");
        }
        else if(ch=='g'||ch=='G'){
            System.out.printf("Green");
        }
        else if(ch=='y'||ch=='Y'){
            System.out.printf("Yellow");
        }
        else if(ch=='o'||ch=='O'){
            System.out.printf("Orange");
        }
        else if(ch=='r'||ch=='R'){
            System.out.printf("Red");
        }
        else{
            System.out.printf("-1");
        }
    }
}