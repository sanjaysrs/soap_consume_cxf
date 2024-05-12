package soap.soap_consume;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import soap.soap_consume.client.EmployeeClient;
import soap.soap_consume.wsdl.EmployeeDetails;
import soap.soap_consume.wsdl.GetEmployeeResponse;

@SpringBootApplication
public class SoapConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapConsumeApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(EmployeeClient client) {
		return args -> {
			GetEmployeeResponse response = client.getEmployeeResponse(3);
			EmployeeDetails employeeDetails = response.getEmployeeDetails();
			System.out.println(employeeDetails.getId());
			System.out.println(employeeDetails.getFirstName());
			System.out.println(employeeDetails.getLastName());
		};
	}

}
