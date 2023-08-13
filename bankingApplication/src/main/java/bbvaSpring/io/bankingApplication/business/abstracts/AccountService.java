package bbvaSpring.io.bankingApplication.business.abstracts;

import bbvaSpring.io.bankingApplication.entities.Account;

import java.util.List;

public interface AccountService {
    Account saveAccount(Account account);
    void deleteAccount(int account_id);
    List<Account> findAllAccountsByCustomerId(Long customer_id);
    Account findByIbanNo(String ibanNo);
    void withdrawMoney(int accountId, Long amount);
    void depositMoney(int accountId, Long amount);
}
