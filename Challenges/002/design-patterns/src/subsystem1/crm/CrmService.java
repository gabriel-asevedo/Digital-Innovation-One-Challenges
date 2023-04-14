package subsystem1.crm;

public class CrmService {

	private CrmService() {
		super();
	}

	public static void registerClient(String name, String cep, String city, String state) {
		System.out.println("Customer saved in the CRM system");
		System.out.println(name);
		System.out.println(cep);
		System.out.println(city);
		System.out.println(state);

	}

}
