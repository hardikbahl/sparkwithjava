/**
 * 
 */
/**
 * @author hardikbahl
 *
 */
package twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
	private int speed;
	
	

	public Hero(int speed) {
		super();
		this.speed = speed;
	}


	public int getSpeed() {
		return speed;
	}
	
	public void radio() {
		System.out.println("Radio device");
	}


	@Override
	public void getModelName() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getRegistrationNumber() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getOwnerName() {
		// TODO Auto-generated method stub
		
	}


	}
	