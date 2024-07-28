package Java_FSE.week_1.Algorithms_and_Data_Structures.Library_Management_System;

public class Book {
    
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    //Getters
    public int getBookId(){
        return bookId;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    //Setters
    public void setBookId(int bookId){
        this.bookId = bookId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void printBookDetails(){
        System.out.println("Book ID: " + bookId + "; Title: " + title + "; Author: " + author);
    }
}
