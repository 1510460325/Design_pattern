package cn.wzy.Strategy.strates;

import cn.wzy.Strategy.base.Weapon;

public class HandsGun implements Weapon {
	@Override
	public void shoot() {
		System.out.println("手枪biu biu biu!");
	}
}
