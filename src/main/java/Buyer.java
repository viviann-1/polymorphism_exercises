public class Buyer implements IBuy{

    private String name;

    public Buyer(String name){
        this.name = name;
    }

    public String buy(int amount){
        return this.name + " bought a student flat for " + amount + " today";
    }

}
