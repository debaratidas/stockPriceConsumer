package com.stockprice.consumer.stockPriceConsumer.repo;

import com.stockprice.consumer.stockPriceConsumer.model.UserLogin;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends CrudRepository<UserLogin, String> {

    default public UserLogin findByUserId(String userId) {
        Optional<UserLogin> userLogin =findById(userId);
        if(userLogin.isPresent()){
            return userLogin.get();
        }

        return new UserLogin();
    }
}
