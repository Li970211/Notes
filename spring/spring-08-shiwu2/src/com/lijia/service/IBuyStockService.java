package com.lijia.service;

public interface IBuyStockService {
	void openAccount(String aname, double money);
	void openStock(String sname, int amount);
	
	void buyStock(String aname, double money, String sname, int amount) throws BuyStockException;
}
