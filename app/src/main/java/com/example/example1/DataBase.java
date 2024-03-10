package com.example.example1;

import java.util.ArrayList;

public class DataBase {

    private ArrayList<Book> book = new ArrayList<>();


    public DataBase() {


        book.add(new Book("Web", "Ibraheem", "Web"));

        book.add(new Book("Data Base", "Khaled", "Data Base"));

        book.add(new Book("Os", "Ali Jaber", "OpertING sYSTEM"));

        book.add(new Book("Compiler", "Ali Jaber", "Comp"));


    }


    public ArrayList Serche(String Ja) {

        ArrayList<Book> Result=new ArrayList<>();

        for(int i=0;i<book.size();i++){

            if(book.get(i).getCat().equals(Ja)){

                Result.add(book.get(i));
            }

        }




        return Result;
    }

}
