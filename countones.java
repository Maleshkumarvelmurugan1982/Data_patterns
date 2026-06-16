import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the tvalue:");
        n=sc.nextInt();
        int target=9*n;
        int noof1=1;
        int remainder=10%target;
        while(remainder!=1){
            remainder=(remainder*10)%target;
            noof1++;
        }
        System.out.println(noof1);
        
    }
}
