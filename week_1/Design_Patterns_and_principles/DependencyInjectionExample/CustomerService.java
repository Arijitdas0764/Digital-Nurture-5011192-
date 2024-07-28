package Java_FSE.week_1.Design_Patterns_and_principles.DependencyInjectionExample;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findCustomerById(int id) {
        Customer foundCustomer = customerRepository.findCustomerById(id);
        return foundCustomer == null ? new Customer(-1, "Not found") : foundCustomer;
    }
}
