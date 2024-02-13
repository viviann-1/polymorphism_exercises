import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Office extends Building {

    private String companyName;
    private int numberOfComputers;

        public Office(String name, String address, int numberOfRooms, String dateOfConstruction) {
            super(name, address, numberOfRooms, dateOfConstruction);
        }

 // getters and setters

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNumberOfComputers() {
        return numberOfComputers;
    }

    public void setNumberOfComputers(int numberOfComputers) {
        this.numberOfComputers = numberOfComputers;
    }
    public void canCountNumberOfComputers(){
            this.numberOfComputers = numberOfComputers;
    }
}

