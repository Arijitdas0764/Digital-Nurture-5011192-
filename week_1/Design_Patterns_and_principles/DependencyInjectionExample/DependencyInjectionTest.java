package Java_FSE.week_1.Design_Patterns_and_principles.DependencyInjectionExample;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);

        System.out.println("=== Finding customer by ID ===");
        Customer foundCustomer = customerService.findCustomerById(1);
        foundCustomer.printCustomerDetails();
    }
}
