package cn.wzy.Single;

public class SingleObject {

	private static SingleObject instance;

	/**
	 * 当需要实例化的对象是null的时候，那么加锁，再次检查是否为null，最后赋值
	 * 因为会出现两个线程同时检查到最外层的实例为null，再竞争锁，所以，竞争之后需要再次检查
	 * @return
	 */
	public static SingleObject getInstance() {
		if (instance == null) {
			synchronized (SingleObject.class) {
				if (instance == null) {
					instance = new SingleObject();
				}
			}
			return instance;
		} else {
			return instance;
		}
	}
}
