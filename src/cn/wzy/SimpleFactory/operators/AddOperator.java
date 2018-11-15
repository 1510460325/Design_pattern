package cn.wzy.SimpleFactory.operators;

import cn.wzy.SimpleFactory.base.Operator;

public class AddOperator extends Operator {
  @Override
  public double operate(double a, double b) {
    return a + b;
  }
}
