package config;

import com.stockprice.consumer.stockPriceConsumer.repo.UserRepo;
import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@TestConfiguration
public class BeanConfiguration {

    @Bean
    public UserRepo userRepo(){
        UserRepo repo = Mockito.mock(UserRepo.class);
        return repo;
    }
}
