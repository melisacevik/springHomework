package bbvaSpring.io.bankingApplication.business.abstracts;

import bbvaSpring.io.bankingApplication.entities.Customer;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    void deleteCustomer(Long customer_id);
    Customer findById(Long customer_id);
    Customer findByIdentityNo(String identityNo);
}
