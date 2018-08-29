package cn.yourancc.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import cn.yourancc.service.SimpleWebService;
import cn.yourancc.service.SimpleWebServiceServiceLocator;

public class WebServiceClient {

	public static void main(String[] args) throws ServiceException, RemoteException {
		SimpleWebService sws = new SimpleWebServiceServiceLocator().getSimpleWebServicePort();
		String name = sws.getValue("°¡À­À­");
		System.out.println(name);
	}
}
