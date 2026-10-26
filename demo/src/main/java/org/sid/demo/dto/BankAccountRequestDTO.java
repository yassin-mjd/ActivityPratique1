package org.sid.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.demo.enums.AccountType;
@Data
@AllArgsConstructor
@NoArgsConstructor @Builder
public class BankAccountRequestDTO {
    public AccountType type;
    private Double balance;
    private String currency;
    private AccountType accountType;
}
