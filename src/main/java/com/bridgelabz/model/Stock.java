package com.bridgelabz.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock {

	private Integer stockId;
	private String stockCode;
	private String stockName;
	/*private List<StockDailyRecord> stockDailyRecords = new ArrayList<StockDailyRecord>();*/
	
	
	@Id
	@GeneratedValue
	@Column(name = "STOCK_ID", unique = true, nullable = false)
	public Integer getStockId() {
		return this.stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	@Column(name = "STOCK_CODE", unique = true, nullable = false, length = 10)
	public String getStockCode() {
		return this.stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	@Column(name = "STOCK_NAME", unique = true, nullable = false, length = 20)
	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	/*@OneToMany(fetch = FetchType.LAZY ,cascade = {CascadeType.PERSIST ,CascadeType.ALL})
	public List<StockDailyRecord> getStockDailyRecords() {
		return this.stockDailyRecords;
	}

	public void setStockDailyRecords(List<StockDailyRecord> stockDailyRecords) {
		this.stockDailyRecords = stockDailyRecords;
	}*/
}
