package cn.wzy.observer.subjects;

import cn.wzy.observer.Observer;

public interface Subject {
	void attch(Observer observer);
	void detach(Observer observer);
	void notifyObserver();
}
