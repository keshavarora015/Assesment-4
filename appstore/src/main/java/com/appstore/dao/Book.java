package com.appstore.dao;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="book")
public class Book {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String isbn;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="publisher_No")
	private Publisher publisher;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_chapterNo")
	private List<Chapter> chapters;
	
	public Book() {}

	public Book(int id, String isbn, String name, Publisher publisher, List<Chapter> chapters) {
		this.id = id;
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
		this.chapters = chapters;
	}
	

	public Book(String isbn, String name, Publisher publisher, List<Chapter> chapters) {
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
		this.chapters = chapters;
	}

	public Book(String isbn, String name, Publisher publisher) {
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=");
		builder.append(id);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append(", name=");
		builder.append(name);
		builder.append(", publisher=");
		builder.append(publisher);
		builder.append(", chapters=");
		builder.append(chapters);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}












































