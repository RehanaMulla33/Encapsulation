package Encapsulation;

public class Medicine {
	private String name;
	private String mfDate;
	private String exp;
	private double mg;
	private int price;

	public void medCure() {
		System.out.println("Diesese cure");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMfDate(String mfDate) {
		this.mfDate = mfDate;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public void setMg(Double mg) {
		if (mg < 100) {
			this.mg = mg;
		} else {
			System.out.println("Please mention proper mg");
		}
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public String getMfDate() {
		return this.mfDate;
	}

	public String getExp() {
		return this.exp;
	}

	public double getMg() {
		return this.mg;
	}

	public int getPrice() {
		return this.price;
	}

}
