import com.stockprice.consumer.stockPriceConsumer.StockPriceConsumerApplication;
import config.BeanConfiguration;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/testInteg/resources/features",
        glue={"test","config"},
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })
@SpringBootTest
@Import(BeanConfiguration.class)
public class CucumberTestRunner {
}
