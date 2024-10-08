package library;

public class Newspaper extends Material {

    public String publisher;
    public String pages;

    public Newspaper(String title, 
    String author, 
    String publishDate, 
    String publisher, 
    String pages){
        super(title, author, publishDate);
        this.publisher = publisher;
        this.pages = pages;
    }
    
}
