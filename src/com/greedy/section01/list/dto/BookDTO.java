package com.greedy.section01.list.dto;

public class BookDTO {

	private int number;
	private String title;
	private String auther;
	private int price;
	
	public BookDTO() {}

	public BookDTO(int number, String title, String auther, int price) {
		super();
		this.number = number;
		this.title = title;
		this.auther = auther;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public String getTitle() {
		return title;
	}

	public String getAuther() {
		return auther;
	}

	public int getPrice() {
		return price;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookDTO [number=" + number + ", title=" + title + ", auther=" + auther + ", price=" + price + "]";
	}
	
	
	
}
