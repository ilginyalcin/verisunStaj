
package json.data;

import javax.jws.WebService;
import javax.jws.WebMethod;
import utils.ListToGson;


@WebService(serviceName = "service")
public class service {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "yap")
    public String yap() throws Exception {
        Main mn=new Main();
        ListToGson lg=new ListToGson();
        return lg.toJson();
    }
}
