import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int i=1, gcd=1;
        for(i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println("the greatest divisors of Number " +a+ " and " +b+ " is: "+gcd);
        
    }
    
}
