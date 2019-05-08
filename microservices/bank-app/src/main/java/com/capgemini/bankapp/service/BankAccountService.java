package com.capgemini.bankapp.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.bankapp.entity.BankAccount;

public interface BankAccountService {

	BankAccount addNewAccount(BankAccount account);

	Optional<BankAccount> findAccountById(int id);

	List<BankAccount> getAllAccounts();

	boolean updateAccount(BankAccount account);

	boolean deleteAccount(int id);

}
