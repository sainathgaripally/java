import java.lang.*;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    int n = 985;
    int sum = 0;
    while (n > 0) {
      sum = sum + n%10;
      n /= 10;
    }
    System.out.println(sum);
  }
}