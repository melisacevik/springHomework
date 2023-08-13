package bbvaSpring.io.bankingApplication.business.concretes;

import bbvaSpring.io.bankingApplication.business.abstracts.CustomerService;
import bbvaSpring.io.bankingApplication.entities.Customer;
import bbvaSpring.io.bankingApplication.dataAccess.abstracts.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerManager implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long customer_id) {
        customerRepository.deleteById(customer_id);
    }

    @Override
    public Customer findById(Long customer_id) {
        return customerRepository.findById(customer_id).orElse(null);
    }

    @Override
    public Customer findByIdentityNo(String identityNo) {
        return customerRepository.findByIdentityNo(identityNo);
    }
}
