package cn.yourancc.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class SimpleWebService {
    /** ���ͻ��˵��÷���  �÷����ǷǾ�̬�ģ��ᱻ����
     * @param name  �������
     * @return String ���ؽ��
     * */
    public String getValue(String name){
        return "��ӭ�㣡 "+name;
    }

    /**
     * �����ϼ�@WebMentod(exclude=true)�󣬴˷�������������
     * @param name
     * @return
     */
    @WebMethod(exclude=true)  
    public String getHello(String name){
        return "��ã� "+name;
    }

    /** ��̬�������ᱻ����
     * @param name
     * @return
     */
    public static String getString(String name){
        return "�ټ���"+name;
    }


     //ͨ��EndPoint(�˵����)����һ��WebService
    public static void main(String[] args) {
     /*����:1,���صķ����ַ;
           2,�ṩ�������;
      */
     Endpoint.publish("http://127.0.0.1:8080/Service/ServiceHello", new SimpleWebService());
     System.out.println("�����ɹ�!");
     //�����ɹ��� ����������� http://127.0.0.1:8080/Service/ServiceHello?wsdl
    }
}
