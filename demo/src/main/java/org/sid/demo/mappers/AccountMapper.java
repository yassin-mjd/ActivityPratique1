package org.sid.demo.mappers;

import org.sid.demo.dto.BankAccountResponseDTO;
import org.sid.demo.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount) {
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount, BankAccountResponseDTO.class);
        return bankAccountResponseDTO;
    }
}
