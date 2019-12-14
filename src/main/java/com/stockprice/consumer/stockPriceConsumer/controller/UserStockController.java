package com.stockprice.consumer.stockPriceConsumer.controller;

import com.stockprice.consumer.stockPriceConsumer.model.UserLogin;
import com.stockprice.consumer.stockPriceConsumer.model.UserStock;
import com.stockprice.consumer.stockPriceConsumer.model.UserStockId;
import com.stockprice.consumer.stockPriceConsumer.repo.UserStockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/userstock")
public class UserStockController {

    @Autowired
    UserStockRepo userStockRepo;

    @RequestMapping(value = "/addStock" , method = RequestMethod.POST)
    public String validateLogin(@RequestParam(value = "loginId", required = false) String userId,
                                 @RequestParam(value = "stocks", required = false) List<String> stocks){
       if(!CollectionUtils.isEmpty(stocks)){
           stocks.forEach(stock->{
               UserStock userStock = new UserStock();
//               UserStockId userStockId= new UserStockId();
               userStock.setStockId(stock);
               userStock.setUserId(userId);

               userStockRepo.save(userStock);
           });
       }
        return "Success";
    }

}
