package cn.wzy.Strategy;

public class Main {

  public static void main(String[] args) {
    double before = 10;
    Context context = new Context("two");
    System.out.println(context.calculation(before));
  }
}
