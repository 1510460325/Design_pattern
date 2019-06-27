package cn.wzy.Factory;

import cn.wzy.Factory.base.Operator;
import cn.wzy.Factory.factorys.AddFactory;
import cn.wzy.Factory.factorys.OPeratorFactory;
import cn.wzy.Factory.factorys.SubFactory;

public class Main {
  public static void main(String[] args) {
    OPeratorFactory factory = new AddFactory();
    Operator instance = factory.getInstance();
    System.out.println(instance.execute(15));

    OPeratorFactory factory1 = new SubFactory();
    Operator instance1 = factory1.getInstance();
    System.out.println(instance1.execute(15));
  }
}
