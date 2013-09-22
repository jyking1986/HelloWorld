package com.example.helloworld.views;


import com.example.helloworld.core.Book;
import com.yammer.dropwizard.views.View;

import java.util.ArrayList;
import java.util.List;

public class BooksView extends View {



    public BooksView() {
        super("/views/Pages/books.ftl");

    }

}
