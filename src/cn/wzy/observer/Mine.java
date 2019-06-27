package cn.wzy.observer;

public class Mine implements Observer {
	@Override
	public void update() {
		System.out.println("地雷兵快跑呀~");
	}
}
