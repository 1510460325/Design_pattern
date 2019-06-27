package cn.wzy.Buider;

public class Main {
	public static void main(String[] args) {
		Room room = Room.builder()
			.floor("new floor")
			.top("new top")
			.door("new door")
			.window("new window")
			.build();
		System.out.println("Employee :[ Name : John, dept : CEO, salary :30000 ]\n" +
			"Employee :[ Name : Robert, dept : Head Sales, salary :20000 ]\n" +
			"Employee :[ Name : Richard, dept : Sales, salary :10000 ]\n" +
			"Employee :[ Name : Rob, dept : Sales, salary :10000 ]\n" +
			"Employee :[ Name : Michel, dept : Head Marketing, salary :20000 ]\n" +
			"Employee :[ Name : Laura, dept : Marketing, salary :10000 ]\n" +
			"Employee :[ Name : Bob, dept : Marketing, salary :10000 ]");
	}
}
