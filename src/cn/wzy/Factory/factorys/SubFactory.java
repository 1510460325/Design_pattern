package cn.wzy.Factory.factorys;


import cn.wzy.Factory.base.Operator;
import cn.wzy.Factory.base.Sub;

public class SubFactory extends OPeratorFactory {
  @Override
  public Operator getInstance() {
    return new Sub();
  }
}
