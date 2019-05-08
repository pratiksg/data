package com.capgemini.bankapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capgemini.bankapp.entity.BankAccount;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	@Override
	public BankAccount addNewAccount(BankAccount account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<BankAccount> findAccountById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BankAccount> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAccount(BankAccount account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAccount(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
