import java.lang.*;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // int start = 4;
    // while (start <= n) {
    //     System.out.println(start);
    //     start += 4;
    // }
    int start = 1;
    while (start <= n) {
      if (start %4 == 0) {
        System.out.println(start);
      }
      start++;
    }
  }
}