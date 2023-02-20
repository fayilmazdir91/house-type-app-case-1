
public abstract class Property {
	
	private int area;
	private int price;
	private int roomCount;
	private int livingRoomCount;
	
	public Property(int area, int price, int roomCount, int livingRoomCount) {
		super();
		this.area = area;
		this.price = price;
		this.roomCount = roomCount;
		this.livingRoomCount = livingRoomCount;
	}
	
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRoomCount() {
		return roomCount;
	}
	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}
	public int getLivingRoomCount() {
		return livingRoomCount;
	}
	public void setLivingRoomCount(int livingRoomCount) {
		this.livingRoomCount = livingRoomCount;
	}

	@Override
	public String toString() {
		return "Property [area=" + area + ", price=" + price + ", roomCount=" + roomCount + ", livingRoomCount="
				+ livingRoomCount + "]";
	}
	
	
}
