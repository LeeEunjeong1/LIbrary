package com.library.vo;

public class BookVO {
	private String bookname;
	private String author; 
	private String bookfield;
	private String publisher; 
	private String publishyear;
	public static int count;
	
	public BookVO(String tBookname, String tAuthor, String tBookfield, String tPublisher, String tPublishyear) {
		
		bookname = tBookname;
		author = tAuthor;
		bookfield = tBookfield;
		publisher = tPublisher;
		publishyear = tPublishyear;
		count++;
	}
	
	public BookVO() {
		
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookfield() {
		return bookfield;
	}

	public void setBookfield(String bookfield) {
		this.bookfield = bookfield;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublishyear() {
		return publishyear;
	}

	public void setPublishyear(String publishyear) {
		this.publishyear = publishyear;
	}
	
	

}
