package library;

public class Multimedia extends Material {

    public String format;

    public Multimedia(
        String title, 
        String author, 
        String publishDate, 
        String format
    ){

        super(title, author, publishDate);
        this.format = format;
    }
    
}
