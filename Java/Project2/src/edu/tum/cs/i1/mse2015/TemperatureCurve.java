package edu.tum.cs.i1.mse2015;

import java.text.DecimalFormat;

public class TemperatureCurve {
	public static void main(String[] args) {
		// ThermoInterface thermo = new CelsiusThermo();
		ThermoInterface thermo = new ThermoAdapter();
		DecimalFormat df = new DecimalFormat ("#.#");
		for (int i=0; i<5; i++) System.out.println(df.format(thermo.getTempC()));
	}
}
	