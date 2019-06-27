package cn.wzy.observer.subjects;

import cn.wzy.observer.Guerrilla;
import cn.wzy.observer.Mine;
import cn.wzy.observer.Villager;

public class Main {

	public static void main(String[] args) {
		Subject janpan = new JanpanSubject();
		janpan.attch(new Villager());
		janpan.attch(new Mine());
		janpan.attch(new Guerrilla());
		janpan.notifyObserver();
	}
}
