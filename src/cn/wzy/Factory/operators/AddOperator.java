package cn.wzy.Factory.operators;

import cn.wzy.Factory.base.Operator;

public class AddOperator extends Operator {
  @Override
  public double operate(double a, double b) {
    return a + b;
  }
}
