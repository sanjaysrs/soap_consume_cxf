package soap.soap_consume.client;

import com.srsanjay.employees.GetEmployeeRequest;
import com.srsanjay.employees.GetEmployeeResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class EmployeeClient extends WebServiceGatewaySupport {

    public GetEmployeeResponse getEmployeeResponse(int id) {

        GetEmployeeRequest request = new GetEmployeeRequest();
        request.setId(id);

//        GetEmployeeResponse response =
//                (GetEmployeeResponse) getWebServiceTemplate().marshalSendAndReceive("http://localhost:8080/ws",
//                request, new SoapActionCallback("http://srsanjay.com/employees/GetEmployeeRequest"));

//        GetEmployeeResponse response = (GetEmployeeResponse) getWebServiceTemplate()
//                .marshalSendAndReceive("http://localhost:8080/ws", request);

        GetEmployeeResponse response = (GetEmployeeResponse) getWebServiceTemplate()
                    .marshalSendAndReceive(request);

        return response;

    }

}
