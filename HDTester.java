package Encapsulation;

public class HDTester {

	public static void main(String[] args) {
		HardDisk harddisk = new HardDisk();
		harddisk.dispInfo();
		harddisk.setBrnd("Toshiba");
		harddisk.setCapacity("1 TB");
		harddisk.setConnectivity("Wireless");
		harddisk.setPrice(5000);
		System.out.println("Brand is" + harddisk.getBrand());
		System.out.println("Capacity of Harddisk  is" + harddisk.getCapacity());
		System.out.println("Connectivity is" + harddisk.getConnectivity());
		System.out.println("price of HardDisk is" + harddisk.getPrice());

	}

}
