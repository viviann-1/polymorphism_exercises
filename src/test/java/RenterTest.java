import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RenterTest {

    Renter renter;

    @BeforeEach
    public void setUp(){
        renter = new Renter("Dave");
    }
    @Test
    public void canRent(){
        String result = renter.rent(2000);
        assertThat(result).isEqualTo("Dave rented his office space for 2000 today");
    }
}
