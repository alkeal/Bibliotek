import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        //b1 är ett objekt
     Book b1 = new Book("Nordisk Historia", "Andersson", 2020 , "Andra utgåvan", true );
          System.out.println(b1.name);
          

       b1.loan();
       b1.returnBook();



     ArrayList<Book> books = new ArrayList<>();

     books.add(b1);

     for ( Book book : books) {
         System.out.println(book);
     }



        }

    }
