import java.util.*;
public class voco{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch =='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
        {
            System.out.printf("Vowel");
        }
        else{
            System.out.printf("Consonant");
        }
    }
}