package demo;
// Data access object(DAO)

import java.util.ArrayList;

/**
 * Created by Owner on 10/24/2016.
 */
public class BookDBAO {
    // get book details given the bookId
    // this method is dummy for now
    public BookDetails getBookDetails(String bookId) {
        // return dummy book for testing now
        return createDummyBook(bookId);
    }

    public  ArrayList<BookDetails> getAllBooks(){
        ArrayList<BookDetails> bookList =  new ArrayList<BookDetails>();

        BookDetails book1 = new BookDetails();
        book1.setBookId("1");
        book1.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        book1.setFirstName("Itzal");
        book1.setSurname("Tru");
        book1.setInventory(1);
        book1.setOnSale(true);
        book1.setPrice(45.00f);
        book1.setTitle("Duke: A Biography of the Java Evangelist");
        book1.setYear(2015);

        BookDetails book2 = new BookDetails();
        book2.setBookId("2");
        book2.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        book2.setFirstName("Kevin");
        book2.setSurname("Novation");
        book2.setInventory(2);
        book2.setOnSale(true);
        book2.setPrice(10.75f);
        book2.setTitle("From Oak to Java:The Revolution of a Language");
        book2.setYear(2015);

        BookDetails book3 = new BookDetails();
        book3.setBookId("3");
        book3.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        book3.setFirstName("James");
        book3.setSurname("Gosling");
        book3.setInventory(3);
        book3.setOnSale(true);
        book3.setPrice(30.95f);
        book3.setTitle("Java Intermediate Bytecodes");
        book3.setYear(2015);

        BookDetails book4 = new BookDetails();
        book4.setBookId("4");
        book4.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        book4.setFirstName("Duke");
        book4.setSurname("");
        book4.setInventory(4);
        book4.setOnSale(true);
        book4.setPrice(30.75f);
        book4.setTitle("My Early Years");
        book4.setYear(2015);

        BookDetails book5 = new BookDetails();
        book5.setBookId("5");
        book5.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        book5.setFirstName("Ben");
        book5.setSurname("Thrilled");
        book5.setInventory(5);
        book5.setOnSale(true);
        book5.setPrice(30.00f);
        book5.setTitle("The Green Project: Programming for Consumer Devices");
        book5.setYear(2015);

        BookDetails book6 = new BookDetails();
        book6.setBookId("6");
        book6.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        book6.setFirstName("Webster");
        book6.setSurname("Masterson");
        book6.setInventory(6);
        book6.setOnSale(true);
        book6.setPrice(27.75f);
        book6.setTitle("Web Components for Web Developers");
        book6.setYear(2015);

        BookDetails book7 = new BookDetails();
        book7.setBookId("7");
        book7.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        book7.setFirstName("eeves");
        book7.setSurname("");
        book7.setInventory(7);
        book7.setOnSale(true);
        book7.setPrice(40.75f);
        book7.setTitle("Web Servers for Fun and Profit");
        book7.setYear(2015);

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);

        return bookList;

    }



    // convenient method to create a dummy book detail
    // this method is meant for testing
    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details.setFirstName("Webster");
        details.setSurname("Masterson");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(27.75f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }
}
