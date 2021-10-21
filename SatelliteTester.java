package Encapsulation;

public class SatelliteTester {

	public static void main(String[] args) {
		Satellite SAT=new Satellite();
		SAT.launch();
		SAT.track();
		System.out.println("___________________");
		SAT.setname("GISAT-1");
		SAT.setCost(278657800);
		SAT.setType("Geo stationary");
		SAT.setLaunch("11/08/2021");
		SAT.setPlace("Satish Dhawan Shri Hari kota");
		System.out.println("Recently launched satellite  is"+SAT.getname());
		System.out.println("Approximate cost of the satellite is"+SAT.getCost());
		System.out.println("The satellite is lanched from "+SAT.getPlace());
		System.out.println("The type of satellite is  is"+SAT.getType());
		System.out.println("satellite launch date is"+SAT.getLaunch());
		System.out.println("____________________");
		
	
		

	}


	}

