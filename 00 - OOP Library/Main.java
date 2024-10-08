import library.Client;
import library.Loan;
import library.Material;
import library.Multimedia;
import library.Newspaper;
import library.Book;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client(
            "Esteban",
             "Montoya",
             "Fake Street 123",
             "54321", 
             "abc@mail.com",
             "22-04-1938");

        Material book = new Book(
            "The Lord of the Rings",
            "J. R. R. Tolkien",
            "1962",
            "Penguin Random House",
            "562"
        );

        Material newspaper = new Newspaper(
            "Disaster in World Trade Center",
            "Robert Smith",
            "2001",
            "New York Times",
            "28"
        );

        Material movie = new Multimedia(
            "E.T.",
            "Steven Spielberg",
            "1982",
            "DVD"
        );
        
        Loan Loan1 = new Loan(
            "17-09-2024",
            client1, book);

        Loan1.getCheckIn();

        book.getStatus();

        book.setUnavailable();

        book.getStatus();

        Loan Loan2 = new Loan(
            "18-09-2024",
            client1, movie);

        Loan2.getCheckIn();

        movie.getStatus();

        movie.setUnavailable();

        movie.getStatus();

        Loan Loan3 = new Loan(
            "23-09-2024",
            client1, newspaper);

        Loan3.getCheckIn();

        newspaper.getStatus();

        newspaper.setUnavailable();

        newspaper.getStatus();
    }
}