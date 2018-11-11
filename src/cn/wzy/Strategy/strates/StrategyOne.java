package cn.wzy.Strategy.strates;

import cn.wzy.Strategy.base.BaseStrategy;

public class StrategyOne implements BaseStrategy {
  @Override
  public double execute(double before) {
    return before;
  }
}
