import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {

    Office office;

    @BeforeEach
    public void setUp() {
        office = new Office("Accounting Office", "24 Number Street", 40, "9th December 1950");
    }

    @Test
    public void canGetCompanyName() {
        assertThat(office.getName()).isEqualTo("Accounting Office");
    }
    @Test
    public void setCompanyName(){
        office.setCompanyName("Accounting Office");
        assertThat(office.getCompanyName()).isEqualTo("Accounting Office");
    }
    @Test
    public void canGetNumberOfComputers(){
        assertThat(office.getNumberOfComputers()).isEqualTo(0);
    }
    @Test
    public void setNumberOfComputers(){
        office.setNumberOfComputers(15);
        assertThat(office.getNumberOfComputers()).isEqualTo(15);
    }

}






