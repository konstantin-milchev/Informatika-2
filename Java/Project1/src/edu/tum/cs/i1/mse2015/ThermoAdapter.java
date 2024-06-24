package edu.tum.cs.i1.mse2015;

public class ThermoAdapter implements ThermoInterface{

	private FahrenheitThermo thermo;
	
	public ThermoAdapter(){
		
		thermo=new FahrenheitThermo();
	}
	
	public double getTempC(){
		
		return  (thermo.getTemp() -32.0) * (5.0/9.0);
		
	}

	
}
