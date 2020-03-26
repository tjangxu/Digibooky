package com.nullexceptional.digibooky.domain.book;

public class BookDtoDetails {
    private final String isbn;
    private final String title;
    private final Author author;
    private final String summary;

    public BookDtoDetails(String isbn, String title, Author author, String summary) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.summary = summary;
    }
}
