package com.example.demo;

import java.io.FileInputStream;
import java.io.IOException;

import lombok.Cleanup;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Books b = new Books();
        b.setAuthor("author1"); 
        b.setId(1);
        b.setName("book1");
        b.setPrice(20.00);
        System.out.println("Book1 details "+b);
        
        Books b2 = new Books(2,"book2","author2",20.00);
        System.out.println("Is book b same as b2 :"+b.equals(b2));
        
        Books b3= new Books(1,"book1","author1",20.00);
        System.out.println("Is book b same as b3 :"+b.equals(b3));
        
        Books b4 = Books.builder().id(3).author("author3").name("book4").price(10.00).build();
        System.out.println("Book b4 is "+b4);
       
        @Cleanup FileInputStream fis = new FileInputStream("/home/parallels/Documents/client/myfile.txt");
        int i = 0;
        char c;
       // read till the end of the file
        while((i = fis.read())!=-1) {
          c = (char)i;
          System.out.print(c);
        } 
       
    }
}
