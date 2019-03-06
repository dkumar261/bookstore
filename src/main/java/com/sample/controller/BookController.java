package com.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Book;

@RestController
public class BookController {

	@GetMapping(value="/call")
	public Book getBook() {
		Book book = new Book();
		book.setName("Java");
		book.setWriter("Martin");
		book.setPrice(100);
		return book;
	}
}
