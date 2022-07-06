package com.hungpq17.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hungpq17.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

}
