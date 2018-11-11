package cn.wzy.Strategy.strates;

import cn.wzy.Strategy.base.BaseStrategy;

public class StrategyTwo implements BaseStrategy {
  @Override
  public double execute(double before) {
    return before * 0.5;
  }
}
