package library;

public class Material {

    public String title;
    public String author;
    public String publishDate;
    public String status;

    public Material(String title, String author, String publishDate){
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.status = "available";
    }

    public void getStatus(){
        System.out.printf("The material status is: %s", this.status);
    }

    public void setAvailable(){
        if (this.status == "available"){
            System.out.println("The material is already available");
        }else{
            this.status = "available";
        }
    }

    public void setUnavailable(){
        if (this.status == "unavailable"){
            System.out.println("The material is currently not available");
        }else{
            this.status = "unavailable";
        }
    }   
    
}
