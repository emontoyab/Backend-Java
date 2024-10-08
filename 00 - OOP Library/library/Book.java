package library;

public class Book extends Material{

    public String publishingHouse;
    public String pages;

    public Book(String title, 
    String author, 
    String publishDate, 
    String publishingHouse, 
    String pages){
        super(title, author, publishDate);
        this.publishingHouse = publishingHouse;
        this.pages = pages;
    }
    
}
