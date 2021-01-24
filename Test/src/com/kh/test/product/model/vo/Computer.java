package com.kh.test.product.model.vo;

public class Computer {
	private int serialNumber;
	private int productCode;
	private String productName;
	
	public Computer() {
		
	}
	
	public Computer(int productCode, String productName, int serialNumber) {
		this.serialNumber = serialNumber;
		this.productCode = productCode;
		this.productName = productName;
		
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void makeProduck() {
		System.out.println("상품코드 : " + productCode + "상품명 : " + productName 
							+ "제품유형 :" + serialNumber + "컴퓨터를 생산하였습니다.");
	}
}
