package bbvaSpring.io.bankingApplication.dataAccess.abstracts;

import bbvaSpring.io.bankingApplication.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    List<Account> findAllByCustomerId(Long customer_id);
    Account findByIbanNo(String ibanNo);

    List<Account> findAllByCustomer(Long customer_id);
}
