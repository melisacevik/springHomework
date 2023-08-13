package bbvaSpring.io.bankingApplication.business.concretes;

import bbvaSpring.io.bankingApplication.business.abstracts.AccountService;
import bbvaSpring.io.bankingApplication.entities.Account;
import bbvaSpring.io.bankingApplication.dataAccess.abstracts.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountManager implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(int id) {
        accountRepository.deleteById(id);
    }

    @Override
    public List<Account> findAllAccountsByCustomerId(Long customer_id) {
        return accountRepository.findAllByCustomer(customer_id);
    }

    @Override
    public Account findByIbanNo(String ibanNo) {
        return accountRepository.findByIbanNo(ibanNo);
    }

    @Override
    public void withdrawMoney(int accountId, Long amount) {
        // Implement your withdraw logic here
    }

    @Override
    public void depositMoney(int accountId, Long amount) {
        // Implement your deposit logic here
    }
}
