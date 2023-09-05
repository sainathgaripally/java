import java.lang.*;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    int n = 985;
    while(n > 0) {
      System.out.print(n%10 + " ");
      n /= 10;
    }
  }
}