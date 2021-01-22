import com.stockprice.consumer.stockPriceConsumer.FindGaurdian;
import org.junit.Assert;
import org.junit.Test;

public class FindGaudianTest {
    @Test
    public void testFindGaurdainForMonor() {
        FindGaurdian findGaurdian= new FindGaurdian();
        String result =findGaurdian.findGaurdian("123123214");
        Assert.assertEquals("Somnath",result);
    }
}
