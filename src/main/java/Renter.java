public class Renter implements IRent{

    private String name;

    public Renter(String name){
        this.name = name;
    }

    public String rent(int amount){
        return this.name + " rented his office space for " + amount + " today";
    }
}
