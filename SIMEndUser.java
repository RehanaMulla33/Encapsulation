package Encapsulation;

public class SIMEndUser {

	public static void main(String[] args) {
		SIMCard SIM=new SIMCard();
		SIM.setSubscriber("Airtel");
		SIM.setprice(500);
		SIM.setType("Micro SIM");
		SIM.setValidity("26/12/2025");
		System.out.println("SIM card subecriber is"+SIM.getSubscriber());
		System.out.println("Price of SIMr is"+SIM.getPrice());
		System.out.println("Type of SIM card is"+SIM.getType());
		System.out.println("Validity of SIM card  is"+SIM.getValidiyt());
		SIM.activation();
		SIM.block();
		SIM.port();
		

	}

}
