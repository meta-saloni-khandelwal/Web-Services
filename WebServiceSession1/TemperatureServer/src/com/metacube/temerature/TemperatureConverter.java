package com.metacube.temerature;

import javax.jws.WebMethod;
import javax.jws.WebService;
/**
 * Class Name- TemperatureConverter
 * @author Saloni Khandelwal
 *
 */

/* A class to convert temperature in degree celsius.
 * */
@WebService
public class TemperatureConverter {
	@WebMethod
	/**
	 * Below function takes input in degree fahrenhiet and returns temperature in degree celsius.
	 * @param fahrenhiet
	 * @return temperature in degree celsius
	 */
	public double changeFahrenheitToCelsius(double fahrenhiet){
		double celsius = ((fahrenhiet - 32)*5)/9;
		return celsius;
	}
}
