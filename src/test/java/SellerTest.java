import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SellerTest {

    Seller seller;

    @BeforeEach
    public void setUp(){
        seller = new Seller("Jane");
    }
    @Test
    public void canSell(){
        String result = seller.sell(500000);
        assertThat(result).isEqualTo("Jane sold the bungalow for 500000 today");
    }
}
