import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EstateAgentTest {
    EstateAgent estateAgent;
    Building buildings;
    Building bungalow;
    Building studentFlat;
    Building office;


    @BeforeEach
    public void setup() {
        estateAgent = new EstateAgent();
    }

    @Test
    public void canCountBuildings() {
        assertThat(estateAgent.countBuildings()).isEqualTo(0);
    }
}



 /////////
    //public void canAddBuildings(){
      //  Bungalow bungalow = new Bungalow("Cool Bungalow", "123 Flower Lane", 4, " July 4th 2001");
        //StudentFlat studentFlat = new StudentFlat("Modern Flats", "456 Honey Close", 50, "August 6th 2020");
        //Office office = new Office("High End Office", "1011 Woodland Way", 30, "January 9th 1950");

        //buildings.addBuildings(bungalow);
        //buildings.addBuildings(studentFlat);
        //buildings.addBuildings(office);

        //assertThat(estateAgent.countBuildings().isEqualTo());
    //}


    //}


