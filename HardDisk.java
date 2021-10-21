package Encapsulation;

public class HardDisk {
	private String brand;
	private int price;
	private String capacity;
	private String connectivity;
	
	public void dispInfo() {
		System.out.println("Following criteria of HardDisk");
	}

	public void setBrnd(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	public String getBrand() {
		return this.brand;
	}

	public int getPrice() {
		return this.price;
	}

	public String getCapacity() {
		return this.capacity;
	}

	public String getConnectivity() {
		return this.connectivity;
	}

}
