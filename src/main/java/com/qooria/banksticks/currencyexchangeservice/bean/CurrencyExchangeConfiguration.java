package com.qooria.banksticks.currencyexchangeservice.bean;

public class CurrencyExchangeConfiguration {
	
	private String defaultCurrency;
	

	public CurrencyExchangeConfiguration(String defaultCurrency) {
		super();
		this.defaultCurrency = defaultCurrency;
	}

	public String getDefaultCurrency() {
		return defaultCurrency;
	}
	
	
}
