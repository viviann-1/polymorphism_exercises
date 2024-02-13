import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentFlat extends Building {

    private int numberOfPartiesHosted;
    private int numberOfStudents;


    public StudentFlat(String name, String address, int numberOfRooms, String dateOfConstruction){
        super(name, address, numberOfRooms, dateOfConstruction);
        }

// Getters and Setters
    public int getNumberOfPartiesHosted() {
        return numberOfPartiesHosted;
    }
    public void setNumberOfPartiesHosted(int numberOfPartiesHosted) {
        this.numberOfPartiesHosted = numberOfPartiesHosted;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}

