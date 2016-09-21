package proj.proj;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import NET.webserviceX.www.GlobalWeatherLocator;
import NET.webserviceX.www.GlobalWeatherSoapStub;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws RemoteException, ServiceException
    {
    	GlobalWeatherLocator loc = new GlobalWeatherLocator();
        loc.setEndpointAddress("GlobalWeatherSoap", "http://www.webservicex.com/globalweather.asmx");

    	
    	GlobalWeatherSoapStub stub = new GlobalWeatherSoapStub();
    	
    	System.out.println(stub.getWeather("kanpur", "india"));
    }
}
