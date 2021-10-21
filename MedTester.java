package Encapsulation;

public class MedTester {

	public static void main(String[] args) {
		Medicine medicine = new Medicine();
		medicine.setExp("05/05/2021");
		medicine.setName("DOLO");
		medicine.setMfDate("01/05/2019");
		medicine.setMg(80.0);
		medicine.setPrice(25);
		System.out.println("name of medicine is"+medicine.getName());
		System.out.println("Medicine  content in gm is"+medicine.getMg());
		System.out.println("Manufacturing date of medicine is"+medicine.getMfDate());
		System.out.println("Expiry date of medicine is"+medicine.getExp());
		System.out.println("price of Medicine is"+medicine.getPrice());
		medicine.medCure();
		
	}
}
 