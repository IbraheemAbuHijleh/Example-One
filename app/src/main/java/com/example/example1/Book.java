package com.example.example1;

public class Book {

    private String Title;
    private String Aruther;

    private String Cat;

    public Book() {

    }

    public Book(String title , String aruther , String cat) {
        Title = title;
        Aruther=aruther;
        Cat=cat;
    }

    public String getTitle() {
        return Title;
    }

    public String getAruther() {
        return Aruther;
    }

    public String getCat() {
        return Cat;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAruther(String aruther) {
        Aruther = aruther;
    }

    public void setCat(String cat) {
        Cat = cat;
    }
}
