package org.sid.demo.service;

import jakarta.transaction.Transactional;
import org.sid.demo.dto.BankAccountResponseDTO;
import org.sid.demo.entities.BankAccount;
import org.sid.demo.mappers.AccountMapper;
import org.sid.demo.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional


public class AccountServiceImpl implements AccountService {
    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public BankAccountResponseDTO addAccount(BankAccountResponseDTO BankAccountDTO) {
        BankAccount bankAccount = new BankAccount();
        BankAccount saveBankAccount = bankAccountRepository.save(bankAccount);
        BankAccountResponseDTO bankAccountResponseDTO = accountMapper.fromBankAccount(saveBankAccount);

        return bankAccountResponseDTO;
    }
}
