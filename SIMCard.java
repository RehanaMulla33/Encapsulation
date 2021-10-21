package Encapsulation;

public class SIMCard {
	private String subscriber;
	private int price;
	private String type;
	private String validity;
	
	public void activation() {
		System.out.println("Activation of SIM Card is successful");
	}
	public void port() {
		System.out.println("SIM card port is in process");
	}
	public void block() {
		System.out.println("Your SIM card has been blocked");
	}
	
	public void setSubscriber(String  subscriber) {
		this.subscriber =  subscriber;
	}
	public void setprice(int price) {
		this.price =  price;
	}
	public void setType(String type) {
		this.type =  type;
	}
	public void setValidity(String  validity) {
		this.validity =  validity;
	}
	public String getSubscriber() {
		return this.subscriber;
	}

	public int getPrice() {
		return this.price;
	}
	public int getType() {
		return this.price;
	}

	public String getValidiyt() {
		return this.validity;
	}



}
