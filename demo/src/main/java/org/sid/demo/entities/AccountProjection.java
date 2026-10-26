package org.sid.demo.entities;

import org.sid.demo.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types= BankAccount.class, name ="p1")
public interface AccountProjection {
    public String getId();
    public AccountType getType();
}
