package com.dao;

import java.util.List;
import java.util.ArrayList;

import com.model.Bank;
import com.util.WebUssResult;

public interface BankDAO {
	List<Bank> getBankList();
	WebUssResult addBank();
}

