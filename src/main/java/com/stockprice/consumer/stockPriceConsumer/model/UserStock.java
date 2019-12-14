package com.stockprice.consumer.stockPriceConsumer.model;

import javax.persistence.*;

@Entity
@Table(name = "user_stock")
@IdClass(UserStockId.class)
public class UserStock {
    @Id
    private  String userId;
    @Id
    private String  stockId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }
}
