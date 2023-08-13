package bbvaSpring.io.bankingApplication.dataAccess.abstracts;

import bbvaSpring.io.bankingApplication.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByIdentityNo(String identityNo);
    Customer findByEmail(String email);
}
