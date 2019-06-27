package cn.wzy.observer;

public class Villager implements Observer {
	@Override
	public void update() {
		System.out.println("村名们快跑呀~");
	}
}
