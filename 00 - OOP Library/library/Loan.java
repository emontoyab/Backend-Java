package library;

public class Loan {
    private String checkIn;
    public String due;
    public Material material;
    public Client client;

    public Loan(String checkIn, Client client, Material material){
        this.checkIn = checkIn;
        this.due = setDue(checkIn);
        this.client = client;
        this.material = material;
    }
    
    public void getCheckIn(){
        System.out.println(checkIn);
    };

    public String setDue(String checkIn){
        return (checkIn + "8 days later");
    }

}
