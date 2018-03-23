package com.metacube.temerature;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;
/**
 * Class Name-ClientHandler
 * @author Saloni Khandelwal
 *
 */

/**
 * 
 * A class to handle Client request.
 *
 */
public class ClientHandler {
	public static void main(String [] args) throws RemoteException, ServiceException{
		TemperatureConverterServiceLocator serviceLocator = new TemperatureConverterServiceLocator();
		double celsius = serviceLocator.getTemperatureConverter().changeFahrenheitToCelsius(45);
		System.out.println(celsius);
	}
}
