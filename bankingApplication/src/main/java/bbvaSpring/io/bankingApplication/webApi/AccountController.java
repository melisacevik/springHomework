package bbvaSpring.io.bankingApplication.webApi;

import bbvaSpring.io.bankingApplication.entities.Account;
import bbvaSpring.io.bankingApplication.business.abstracts.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<Account> saveAccount(@RequestBody Account account) {
        Account savedAccount = accountService.saveAccount(account);
        return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable int id) {
        accountService.deleteAccount(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/by-customer/{customerId}")
    public ResponseEntity<List<Account>> getAccountsByCustomerId(@PathVariable Long customerId) {
        List<Account> accounts = accountService.findAllAccountsByCustomerId(customerId);
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }

    @GetMapping("/by-iban/{ibanNo}")
    public ResponseEntity<Account> getAccountByIbanNo(@PathVariable String ibanNo) {
        Account account = accountService.findByIbanNo(ibanNo);
        if (account != null) {
            return new ResponseEntity<>(account, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
