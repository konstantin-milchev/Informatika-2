package edu.tum.cs.i1.mse2015;

public class CelsiusThermo implements ThermoInterface {

	private FahrenheitThermo ftherm;

	public CelsiusThermo() {
		this.ftherm = new FahrenheitThermo();
	}

	@Override
	public double getTempC() {
		return (ftherm.getTemp() - 32.0) * (5.0 / 9.0);
	}

	@Override
	public String toString() {
		return "CelsiusThermo.class";
	}
}
