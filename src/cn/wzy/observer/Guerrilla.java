package cn.wzy.observer;

public class Guerrilla implements Observer {
	@Override
	public void update() {
		System.out.println("游击队员快跑呀~");
	}
}
