package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;

/**
 * Created by Owner on 10/24/2016.
 */
@WebServlet(name = "BookCatalogServlet", urlPatterns = "/bookcatalog")
public class BookCatalogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        out.println("<html>" +"<style>\n" +
                "table, th, td {\n" +
                "    border: 1px ;\n" +
                "}\n" +
                "table{padding: 0cm 0cm 0cm 8cm}\n" +
                ".name,.price,.addToCart{\n" +
                "    background-color:yellow;\n" +
                "     color:black;\n" +
                "}\n" +
                "</style>" +"<head><title>Duke's Bookstore</title></head>" +
                "<body  bgcolor=\"#ffffff\">" + "<center>" +
                "<hr> <br> &nbsp;" + "<h1>" +
                "<font size=\"+3\" color=\"#CC0066\">Duke's </font> <img src=\"" +
                "./duke.books.gif\" alt=\"Duke holding books\"\">" +
                "<font size=\"+3\" color=\"black\">Bookstore</font>" + "</h1>" +
                "</center>" + "<br> &nbsp; <hr> <br> ");

        out.println("<br><br><h3>Please choose from our selections:</h3>");


        out.println("<table border=\"0\">\n");

        BookDBAO BookDBAO = new BookDBAO();
        ArrayList<BookDetails> rList = BookDBAO.getAllBooks();
        for (int i = 0; i < rList.size(); i++) {
            BookDetails r = rList.get(i);

            out.println( "<tr><td class=\"name\"><a href>\n" +
                   r.getTitle() +
                    "</a></td>\n" +
                    "    <td class=\"price\" rowspan=\"2\">"+r.getPrice() +"</td>\n" +
                    "    <td class=\"addToCart\" rowspan=\"2\"><a href>Add to Cart</a></td>\n" +
                    "  </tr>\n" +
                    "\n" +
                    "  <tr>\n" +
                    "    <td>by<i> "+r.getFirstName()+" " +r.getSurname() +"</i></td>\n" +
                    "  </tr>\n");
        }


        out.println("</table></body></html>");
    }
}
