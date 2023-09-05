import java.util.*;
import java.lang.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++) {
            int n = sc.nextInt();
            System.out.println(n%10);
        }
    }
}