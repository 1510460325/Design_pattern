package cn.wzy.Buider;

public class Room {
	private String floor;
	private String top;
	private String door;
	private String window;

	public Room(String floor, String top, String door, String window) {
		this.floor = floor;
		this.top = top;
		this.door = door;
		this.window = window;
	}

	@Override
	public String toString() {
		return "Room{" +
			"floor='" + floor + '\'' +
			", top='" + top + '\'' +
			", door='" + door + '\'' +
			", window='" + window + '\'' +
			'}';
	}

	public static RoomBuilder builder(){
		return new RoomBuilder();
	}

	public static class RoomBuilder{
		private String floor;
		private String top;
		private String door;
		private String window;
		public RoomBuilder floor(String floor) {
			this.floor = floor;
			return this;
		}
		public RoomBuilder top(String top) {
			this.top = top;
			return this;
		}
		public RoomBuilder door(String door) {
			this.door = door;
			return this;
		}
		public RoomBuilder window(String window) {
			this.window = window;
			return this;
		}
		public Room build(){
			return new Room(floor, top, door, window);
		}
	}
}
