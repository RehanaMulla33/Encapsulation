package Encapsulation;

public class Satellite {
	private String type;
	private String name;
	private String place;
	private int cost;
	private String launch;
	
	public void launch() {
		System.out.println("ISRO launched-Eye in the sky,-GISAT-1 Earth Observation Satellite");
	}
	 public void track() {
		 System.out.println("Satellites exact track your location ie tracking and monitoring");
	 }
	 
	 public void setType(String type) {
		this.type=type;
	}

	 public void setLaunch(String launch) {
		 this.launch=launch;
	 }
	 public void setname(String name) {
		 this.name=name;
	 }
	 public void setPlace(String place) {
		 this.place=place;
	 }

	 public void setCost(int cost) {
		 this.cost=cost;
	 }
	 public String getType() {
		 return this.type;
	 }
	 public String getname() {
		 return this.name;
	 }
	 public String getPlace() {
		 return this.place;
	 }
	 public double getCost() {
		 return this.cost;
	 }

	 public String getLaunch() {
		return this.launch;
	 }
	
	 }
