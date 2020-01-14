package test;

import com.stockprice.consumer.stockPriceConsumer.StockPriceConsumerApplication;
import com.stockprice.consumer.stockPriceConsumer.controller.LogonController;
import com.stockprice.consumer.stockPriceConsumer.model.UserLogin;
import com.stockprice.consumer.stockPriceConsumer.repo.UserProfileRepo;
import com.stockprice.consumer.stockPriceConsumer.repo.UserRepo;
import config.BeanConfiguration;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.En;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.asyncDispatch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@WebMvcTest(LogonController.class)
@Import(BeanConfiguration.class)
@AutoConfigureWebMvc
@ContextConfiguration(classes = StockPriceConsumerApplication.class, loader = SpringBootContextLoader.class)
@WebAppConfiguration
public class LoginStepDef implements En {

    @Autowired
    private UserRepo userRepo;
    @MockBean
    private UserProfileRepo userProfileRepo;
    @Autowired
    private MockMvc mockMvc;

    private List<String> list ;

    private MvcResult mvcResult;


    @Given("^Following user exist in the system$")
    public void setBackground(DataTable dataTable ) {
        //List<UserLoginTest> userLogins = dataTable.asList(UserLoginTest.class);
       List<Map<String,String>>  maps = dataTable.asMaps();
//        userRepo = Mockito.mock(UserRepo.class);
        maps.forEach(map -> {
            Mockito.when(userRepo.findByUserId(map.get("userId"))).
                    thenReturn(
                    getUserLogin(map.get("userId"),map.get("password")));
        });

    }
    private UserLogin getUserLogin(String userId,String password) {
        UserLogin userLogin = new UserLogin();
        userLogin.setPassWord(password);
        userLogin.setUserId(userId);
        return userLogin;
    }



    @When("when the login api is called")
    public void whenTheLoginApiIsCalled() throws Exception{
        String userId =list.get(0);
        String passWord = list.get(1);
        mvcResult = this.mockMvc.perform(get("/stockprice/login?loginId="+userId+"&password="+passWord)).andReturn();


    }

    @Given("user enter login id (.+) and password (.+)")
    public void userEnterLoginIdTestAndPasswordTest(String arg0, String arg1) throws Exception {
        list = new ArrayList<>();
        list.add(arg0);
        list.add(arg1);
    }

    @Then("It should return (.+)")
    public void itShouldReturnTrue(String result) throws  Exception{

                mvcResult.getResponse().getContentAsString().equals(result);

    }
}
