import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentFlatTest {

    StudentFlat studentFlat;
    @BeforeEach
    public void setUp(){
        studentFlat = new StudentFlat("Fancy Flats", "456 Honey Close", 100, "7th August 2020");
    }
    @Test
    public void getNumberOfParties(){
        assertThat(studentFlat.getNumberOfPartiesHosted()).isEqualTo(0);
    }
    @Test
    public void getNumberOfStudents(){
        assertThat(studentFlat.getNumberOfStudents()).isEqualTo(0);
    }
    @Test
    public void setNumberOfParties(){
        studentFlat.setNumberOfPartiesHosted(100);
        assertThat(studentFlat.getNumberOfPartiesHosted()).isEqualTo(100);
    }
    @Test
    public void setNumberOfStudents(){
        studentFlat.setNumberOfStudents(3000);
        assertThat(studentFlat.getNumberOfStudents()).isEqualTo(3000);
    }

}
