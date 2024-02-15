import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Building{
    private String name;
    private String address;
    private int numberOfRooms;
    private String datOfConstruction;

    ////////// overriding

    ////////


    public Building(String name, String address, int numberOfRooms){
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        String formattedDate = today.format(formatter);
        this.name = name;
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.datOfConstruction = formattedDate;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    public String getDatOfConstruction() {
        return datOfConstruction;
    }
    public void setDatOfConstruction(String datOfConstruction) {
        this.datOfConstruction = datOfConstruction;
    }

}
