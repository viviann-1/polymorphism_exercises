import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EstateAgent {

    private String name;
    private String address;
    private int numberOfRooms;
    private String dateOfConstruction;

    private ArrayList<Building> buildings;

    public EstateAgent(){
        this.buildings = new ArrayList<>();
    }
    public int countBuildings(){
        return this.buildings.size();
    }
    public void addBuildings(Building buildings){
        this.buildings.add(buildings);
    }






}
