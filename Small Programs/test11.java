public class test11 {
  public static void main(String[] args) {
    int h = 0;
    int m = 1;
    int s = 1;
    if (h <= 23 && m <= 59 && s <= 59) {
      int result = (h * 60 + m * 60 + s) * 1000;
      System.out.println(result);
    }
  }
}
