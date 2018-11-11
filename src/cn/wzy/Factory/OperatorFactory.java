package cn.wzy.Factory;

import cn.wzy.Factory.base.Operator;
import cn.wzy.Factory.operators.AddOperator;
import cn.wzy.Factory.operators.BaseOperator;
import cn.wzy.Factory.operators.SubOperator;

public class OperatorFactory {

  public static Operator getOperator(String name) {
    switch (name) {
      case "add":
        return new AddOperator();
      case "sub":
        return new SubOperator();
    }
    return new BaseOperator();
  }
}
