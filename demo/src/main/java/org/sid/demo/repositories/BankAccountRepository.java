package org.sid.demo.repositories;

import org.sid.demo.entities.BankAccount;
import org.sid.demo.enums.AccountType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
    @RestResource(path= "/byType")
    List<BankAccount> findByType(@Param("p") AccountType  type);
}
