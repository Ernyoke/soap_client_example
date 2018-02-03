import com.test.ws.client.CheckVat;
import com.test.ws.client.CheckVatService;

import javax.xml.ws.soap.SOAPFaultException;

public class Main {

    public static void main(String args[]) {
        try {
            CheckVatService checkVatService = new CheckVatService();
            CheckVat checkVat = new CheckVat();
            checkVat.setCountryCode("YY");
            checkVat.setVatNumber("802754375B01");
            System.out.println(checkVatService.getCheckVatPort().checkVat(checkVat).isValid());
        }
        catch (SOAPFaultException e) {
            System.out.println(e.getMessage());
        }
    }
}
