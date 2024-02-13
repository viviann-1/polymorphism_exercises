import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {
    Bungalow bungalow;
    @BeforeEach
    public void setUp(){
        bungalow = new Bungalow("Bungalow Suite", "123 Flower Lane", 4, "July 4th 2001");
    }
    @Test
    public void hasCentralHeating(){
        assertThat(bungalow.hasCentralHeating()).isEqualTo(false);
    }
    @Test
    public void hasGarage(){
        assertThat(bungalow.hasGarage()).isEqualTo(false);
    }
    @Test
    public void canParkInGarage(){
        assertThat(bungalow.canParkInGarage()).isEqualTo(false);
    }

}
