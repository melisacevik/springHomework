package bbvaSpring.io.bankingApplication.entities;

import bbvaSpring.io.bankingApplication.enums.EnumStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Customer")
    @Column(name = "account_id", length = 50, nullable = false)
    private Long accountId;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "surname", length = 50, nullable = false)
    private String surname;

    @Column(name = "identityNo", length = 50, nullable = false)
    private String identityNo;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "password", length = 100, nullable = false)
    private String password;

    @Column(name = "phoneNumber", length = 20, nullable = false)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 30)
    private EnumStatus status;
}
