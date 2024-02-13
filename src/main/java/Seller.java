public class Seller implements interfaces.ISell {

    private String name;

    public Seller(String name){
        this.name = name;
    }

    public String sell(int amount) {
        return this.name + " sold the bungalow for " + amount + " today";
    }
}
