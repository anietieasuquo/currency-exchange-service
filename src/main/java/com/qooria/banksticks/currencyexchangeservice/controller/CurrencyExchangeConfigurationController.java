package com.qooria.banksticks.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qooria.banksticks.currencyexchangeservice.Configuration;
import com.qooria.banksticks.currencyexchangeservice.bean.CurrencyExchangeConfiguration;

@RestController
public class CurrencyExchangeConfigurationController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/default-currency")
	public CurrencyExchangeConfiguration getDefaultCurrency() {
		return new CurrencyExchangeConfiguration(configuration.getDefaultCurrency());
	}

	@GetMapping("/")
	public CurrencyExchangeConfiguration get() {
		return new CurrencyExchangeConfiguration(configuration.getDefaultCurrency());
	}
}
