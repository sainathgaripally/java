import java.lang.*;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    int n = 100;
      for(int row=1; row<=n; row++) {
          if(n%row == 0) {
              System.out.println(row + " is a factor of " + n);
          }
      }
  }
}