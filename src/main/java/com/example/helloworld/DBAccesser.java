package com.example.helloworld;


import com.example.helloworld.core.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DBAccesser {
    private static String filePath="assets/BookList.txt";
    private static String JsonfilePath="assets/BookJsonData.txt";
    public static void Save(String data)
    {
        String dbPath=DBAccesser.class.getClassLoader().getResource(JsonfilePath).getPath();

        try {
            PrintWriter writer=new PrintWriter(dbPath);
            writer.print(data);
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void Save(List<Book> books)
    {
        String dbPath=DBAccesser.class.getClassLoader().getResource(filePath).getPath();

        try {
            PrintWriter writer=new PrintWriter(dbPath);
            writer.print("");
            writer.close();
            writer=new PrintWriter(dbPath);
            for(Book book : books)
            {
                writer.println(book.toString());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static String LoadData(){
        String dbPath=DBAccesser.class.getClassLoader().getResource(JsonfilePath).getPath();
        BufferedReader reader= null;
        StringBuffer sb=new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(dbPath));

            String line = null;

            try {
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return sb.toString();

    }
    public static List<Book> Load() {
        String dbPath=DBAccesser.class.getClassLoader().getResource(filePath).getPath();
        List<Book> list=new ArrayList<Book>();
        BufferedReader reader= null;
        try {
            reader = new BufferedReader(new FileReader(dbPath));

            String line = null;
            String[] arr;
            Book book;
            try {
                while ((line = reader.readLine()) != null) {
                    arr=line.split("\\|");
                    if(arr!=null && arr.length==2)
                    {
                        book=new Book(arr[0],arr[1]);
                        list.add(book);

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Save(list);

        return list;
    }
}
