package cn.wzy.Strategy.strates;

import cn.wzy.Strategy.base.Weapon;

public class SmallGun implements Weapon {
	@Override
	public void shoot() {
		System.out.println("小枪 biu biu biu!");
	}
}
