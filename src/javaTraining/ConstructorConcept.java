package javaTraining;

public class ConstructorConcept {

	String model;
	int carMakeId;
	String carName;
	double price;
	
	public ConstructorConcept() {
		System.out.println("First constructor....");
	}
	
	public ConstructorConcept(int carMakeId) {
		this.carMakeId = carMakeId;
		System.out.println("Car Make ID...........");
	}
	
   public ConstructorConcept(int carMakeId, double price) {
	   this.carMakeId = carMakeId;
	   this.price = price;
	   System.out.println("Car Make ID and Price..........");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorConcept c1 = new ConstructorConcept(26);
		ConstructorConcept c2 = new ConstructorConcept(26, 35646897);
		System.out.println(c1.carMakeId);
		System.out.println(c2.carMakeId + " " + c2.price);
	}

}
