/** 
  * Lab 10 Car class
  * @author Miles Pulliam
  *
*/

public class Car extends Vehicle{
	
	private int doors;
	private int passengers;
	
	public Car(String aMake, String aModel, String aPlate, int aDoor, int aPass){
		
		super(aMake, aModel, aPlate);
		this.doors = aDoor;
		this.passengers = aPass;
	}
	
	public int getDoors(){
		return this.doors;
		
	}
	
	public int getPassengers(){
		return this.passengers;
		
	}
	
	@Override
	public String toString(){
		String result = "";
		result = String.format("%d -door %s %s with licence %s", this.doors, super.getMake(), super.getModel(), super.getPlate());
		return result;
		
	}
	

	public boolean toEquals(Object obj){
		if(!(obj instanceof Car)){
			return false;
			
		}
		
		Car other = (Car)obj;
		int pass = this.passengers;
		int pass2 = other.getPassengers();
		int door = this.doors;
		int door2 = other.getDoors();
		if(super.equals(other) && pass == pass2 && door == door2){
			return true;
		}
		return false;
		
	}
	
	public Car copy(){
		
		Car other = new Car(super.getMake(),super.getModel(),super.getPlate(),this.doors,this.passengers);
		return other;
		
	}
	
	
	
}
