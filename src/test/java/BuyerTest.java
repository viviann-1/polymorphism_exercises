import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BuyerTest {

    Buyer buyer;

    @BeforeEach
    public void setUp(){
        buyer = new Buyer("Sally");
    }
    @Test
    public void canBuy(){
        String result = buyer.buy(100000);
        assertThat(result).isEqualTo("Sally bought a student flat for 100000 today");
    }
}
