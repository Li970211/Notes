package com.lijia.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lijia.dao.IAccountDao;
import com.lijia.dao.IStockDao;

public class BuyStockServiceImpl implements IBuyStockService {
	private IAccountDao adao;
	private IStockDao sdao;
	
	public void setAdao(IAccountDao adao) {
		this.adao = adao;
	}

	public void setSdao(IStockDao sdao) {
		this.sdao = sdao;
	}

	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
	@Override
	public void openAccount(String aname, double money) {
		adao.insertAccount(aname, money);
	}

	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
	@Override
	public void openStock(String sname, int amount) {
		sdao.insertStock(sname, amount);
	}

	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,rollbackFor=BuyStockException.class)
	@Override
	public void buyStock(String aname, double money, String sname, int amount) throws BuyStockException{
		boolean isBuy = true;
		adao.updateAccount(aname, money, isBuy);
		if (2 == 2) {
			throw new BuyStockException("购买股票异常");
		}
		sdao.updateStock(sname, amount, isBuy);
	}

}
