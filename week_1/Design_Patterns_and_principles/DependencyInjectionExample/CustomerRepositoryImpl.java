package Java_FSE.week_1.Design_Patterns_and_principles.DependencyInjectionExample;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customerMap;

    public CustomerRepositoryImpl() {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1, "Rahul Sinha"));
        customerMap.put(2, new Customer(2, "Sikha Dutta"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customerMap.getOrDefault(id, null);
    }
}