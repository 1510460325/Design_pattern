package cn.wzy.Strategy.strates;

import cn.wzy.Strategy.base.Weapon;

public class Knife implements Weapon {
	@Override
	public void shoot() {
		System.out.println("小刀 ka ka ka!");
	}
}
