package com.alexeykuznetsov.petproject.dao;

import com.alexeykuznetsov.petproject.entity.TradePoint;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;
@Repository
public class TradePointDAOImpl implements TradePointDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<TradePoint> showAllTradePoints() {
        Session session = entityManager.unwrap(Session.class);
        List<TradePoint> tradePoints = session.createQuery("from TradePoint", TradePoint.class).getResultList();
        return tradePoints;
    }

    @Override
    public List<TradePoint> showTradePointsOnDate(LocalDate localDate) {
        Session session = entityManager.unwrap(Session.class);
        Query<TradePoint> query = session.createQuery("from TradePoint where dateOfNextVisit >=:visitDate and dateOfNextVisit <=:visitDate");
        query.setParameter("visitDate", localDate);
        List<TradePoint> tradePoints = query.getResultList();
        return tradePoints;
    }

    @Override
    public TradePoint showTradePointById(int id) {
        Session session = entityManager.unwrap(Session.class);
        TradePoint tradePoint = session.get(TradePoint.class, id);
        return tradePoint;
    }

    @Override
    public void createTradePoint(TradePoint tradePoint) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(tradePoint);
    }

    @Override
    public void deleteTradePoint(int id) {
        Session session = entityManager.unwrap(Session.class);
        Query<TradePoint> query = session.createQuery("delete from TradePoint where id =:tradePointId");
        query.setParameter("tradePointId", id);
        query.executeUpdate();
    }
}
