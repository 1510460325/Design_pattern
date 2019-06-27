package cn.wzy.Strategy;

public class Main {

  public static void main(String[] args) {
    Context context = new Context("two");
    context.fight();
    context = new Context("one");
    context.fight();
    context = new Context("three");
    context.fight();
  }
}
