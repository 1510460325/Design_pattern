package cn.wzy.Strategy;

import cn.wzy.Strategy.base.BaseStrategy;
import cn.wzy.Strategy.strates.StrategyOne;
import cn.wzy.Strategy.strates.StrategyTwo;

public class Context {
  private BaseStrategy strategy;

  public Context(String name) {
    switch (name) {
      case "one":
        strategy = new StrategyOne();
        break;
      case "two":
        strategy = new StrategyTwo();
        break;
      default:
        strategy = new StrategyOne();
    }
  }

  public double calculation(double before) {
    return strategy.execute(before);
  }
}
