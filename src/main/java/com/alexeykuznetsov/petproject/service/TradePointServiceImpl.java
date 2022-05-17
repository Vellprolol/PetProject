package com.alexeykuznetsov.petproject.service;

import com.alexeykuznetsov.petproject.dao.TradePointDAO;
import com.alexeykuznetsov.petproject.entity.TradePoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
@Service
public class TradePointServiceImpl implements TradePointService {
    @Autowired
    private TradePointDAO tradePointDAO;
    @Override
    @Transactional
    public List<TradePoint> showAllTradePoints() {
        return tradePointDAO.showAllTradePoints();
    }

    @Override
    @Transactional
    public List<TradePoint> showTradePointsOnDate(LocalDate date) {
        return tradePointDAO.showTradePointsOnDate(date);
    }

    @Override
    @Transactional
    public TradePoint showTradePointById(int id) {
        return tradePointDAO.showTradePointById(id);
    }

    @Override
    @Transactional
    public void createTradePoint(TradePoint tradePoint) {
        tradePointDAO.createTradePoint(tradePoint);
    }

    @Override
    @Transactional
    public void deleteTradePoint(int id) {
        tradePointDAO.deleteTradePoint(id);
    }
}
