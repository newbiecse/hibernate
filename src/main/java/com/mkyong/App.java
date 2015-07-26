package com.mkyong;

import java.util.List;

import com.mkyong.dao.StockDao;
import com.mkyong.stock.Stock;
import com.mkyong.stock.StockAddress;
import com.mkyong.stock.StockDailyRecord;

public class App {
	public static void main(String[] args) {

		StockDao stockDao = new StockDao();
		List<Stock> lstStock = stockDao.getAll();
		
		for (Stock stock : lstStock) {
			System.out.println(stock.getStockName());
			
			// daily record
			for(StockDailyRecord stockDaily : stock.getStockDailyRecords()) {
				System.out.println(stockDaily.getRecordId());
			}
			
			// address
			System.out.println(stock.getStockAddress().getAddress());
		}
		
	}
}
