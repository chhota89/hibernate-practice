package com.bridgelabz.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "stockRecord")
public class StockDailyRecord {

	private Integer recordId;
	//private Stock stock;
	private Float priceOpen;
	
	private Stock stock;
	
	private Date date;

	@Column
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public StockDailyRecord() {
	}

	public StockDailyRecord(Stock stock, Float priceOpen, Float priceClose,
			Float priceChange, Long volume, Date date) {
		//this.stock = stock;
		this.priceOpen = priceOpen;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column (name="stock_daily_id", unique=true, nullable=false)
	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST ,CascadeType.ALL})
	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Column(name = "PRICE_OPEN", precision = 6)
	public Float getPriceOpen() {
		return this.priceOpen;
	}

	public void setPriceOpen(Float priceOpen) {
		this.priceOpen = priceOpen;
	}

}
