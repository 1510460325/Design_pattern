package cn.wzy.observer.subjects;

import cn.wzy.observer.Observer;

import java.util.HashSet;
import java.util.Set;

public class JanpanSubject implements Subject {

	Set<Observer> observers = new HashSet<>();
	@Override
	public void attch(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer: observers) {
			observer.update();
		}
	}
}
