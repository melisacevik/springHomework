package bbvaSpring.io.bankingApplication.entities;

import bbvaSpring.io.bankingApplication.enums.EnumStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="account")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private int accountId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "ibanNo")
    private String ibanNo;

    @Column(name = "currentBalance")
    private Long currentBalance;

    @Enumerated(EnumType.STRING)
    private EnumStatus status;
}
