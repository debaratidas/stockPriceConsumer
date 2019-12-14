package com.stockprice.consumer.stockPriceConsumer.repo;

import com.stockprice.consumer.stockPriceConsumer.model.UserLogin;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserLogin, String> {
}
