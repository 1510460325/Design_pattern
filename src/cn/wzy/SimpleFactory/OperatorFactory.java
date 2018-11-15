package cn.wzy.SimpleFactory;

import cn.wzy.SimpleFactory.base.Operator;
import cn.wzy.SimpleFactory.operators.AddOperator;
import cn.wzy.SimpleFactory.operators.BaseOperator;
import cn.wzy.SimpleFactory.operators.SubOperator;

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
