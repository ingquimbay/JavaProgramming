package com.developer.entity;

public class Currency {
	
	private String code;
	private String name;
	private String symbol;
	
	public Currency() {
		super();
	}

	public Currency(String code, String name, String symbol) {
		this.code = code;
		this.name = name;
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return "Currency [code=" + code + ", name=" + name + ", symbol=" + symbol + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
