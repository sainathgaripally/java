import java.lang.*;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    int n = 30;
    int start = 1;
    while(start*start <= n) {
      System.out.print(start*start + " ");
      start++;
    }
  }
}