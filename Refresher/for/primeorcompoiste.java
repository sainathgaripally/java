import java.util.*;
import java.lang.*;
class HelloWorld {
    public static void main(String[] args) {
        int n = 3;
        int count = 0;
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                count++;
            }
            if(count > 2) {
                break;
            }
        }
        if(count == 2) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}