package org.sid.demo.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.demo.enums.AccountType;

import java.util.Date;
@Entity@AllArgsConstructor@Data@Builder

public class BankAccount {
    @Id
    private String id;
    private Date createdat;
    private Double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    public BankAccount() {
    }
}
