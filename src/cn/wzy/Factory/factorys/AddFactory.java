package cn.wzy.Factory.factorys;

import cn.wzy.Factory.base.Add;
import cn.wzy.Factory.base.Operator;

public class AddFactory extends OPeratorFactory {

  @Override
  public Operator getInstance() {
    return new Add();
  }
}
