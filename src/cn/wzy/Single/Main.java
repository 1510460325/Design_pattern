package cn.wzy.Single;

public class Main {

	public static void main(String[] args) {
		SingleObject singleObject1 = SingleObject.getInstance();
		SingleObject singleObject2 = SingleObject.getInstance();
		System.out.println("获取两个对象相等?结果：" + (singleObject1 == singleObject2));
	}
}
