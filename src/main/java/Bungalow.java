import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bungalow extends Building {

    private boolean centralHeating;
    private boolean garage;

    public Bungalow(String name, String address, int numberOfRooms, String dateOfConstruction) {
        super(name,address, numberOfRooms, dateOfConstruction);
    }


    //Getters and Setters

    public boolean hasCentralHeating() {
        return centralHeating;
    }
    public void setCentralHeating(boolean centralHeating) {
        this.centralHeating = centralHeating;
    }
    public boolean hasGarage() {
        return garage;
    }
    public void setGarage(boolean garage) {
        this.garage = garage;
    }
    public boolean canParkInGarage() {
        return garage;
    }
}

