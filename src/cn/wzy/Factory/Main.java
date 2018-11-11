package cn.wzy.Factory;

import cn.wzy.Factory.base.Operator;

public class Main {
  public static void main(String[] args) {
    double a = 10, b = 1;
    Operator operator = OperatorFactory.getOperator("sub");
    System.out.println(operator.operate(a, b));
  }
}
