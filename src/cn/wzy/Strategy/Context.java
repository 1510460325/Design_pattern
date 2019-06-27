package cn.wzy.Strategy;

import cn.wzy.Strategy.base.Weapon;
import cn.wzy.Strategy.strates.HandsGun;
import cn.wzy.Strategy.strates.Knife;
import cn.wzy.Strategy.strates.SmallGun;

public class Context {
  private Weapon strategy;

  public Context(String name) {
    switch (name) {
      case "one":
        strategy = new HandsGun();
        break;
      case "two":
        strategy = new Knife();
        break;
      default:
        strategy = new SmallGun();
    }
  }

  public void fight() {
    strategy.shoot();
  }
}
