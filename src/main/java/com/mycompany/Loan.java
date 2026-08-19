package com.mycompany;

public class Loan {
    private Customer customer;
    private Book book;
    private String loanDate;
    private String returnDate;

    public Loan(Customer customer, Book book, String loanDate, String returnDate) {
        this.customer = customer;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
