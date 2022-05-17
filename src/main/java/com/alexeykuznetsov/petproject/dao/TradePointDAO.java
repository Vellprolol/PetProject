package com.alexeykuznetsov.petproject.dao;

import com.alexeykuznetsov.petproject.entity.TradePoint;

import java.time.LocalDate;
import java.util.List;

public interface TradePointDAO {
    List<TradePoint> showAllTradePoints();
    List<TradePoint> showTradePointsOnDate(LocalDate date);
    TradePoint showTradePointById(int id);
    void createTradePoint(TradePoint tradePoint);
    void deleteTradePoint(int id);

}
