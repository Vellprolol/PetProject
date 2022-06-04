package com.alexeykuznetsov.petproject.controller;

import com.alexeykuznetsov.petproject.entity.TradePoint;
import com.alexeykuznetsov.petproject.service.TradePointService;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/tradePoints")
public class TradePointRestController {
    @Autowired
    TradePointService tradePointService;


    @GetMapping("/showAllTradePoints")
    @PreAuthorize("hasRole('USER') || hasRole('ADMIN')")
    public List<TradePoint> showAllTradePoints() {
        List<TradePoint> tradePoints =tradePointService.showAllTradePoints();
        return tradePoints;
    }
    @GetMapping("/showTradePoint/{id}")
    @PreAuthorize("hasRole('USER') || hasRole('ADMIN')")
    public TradePoint showTradePointById(@PathVariable int id) {
        TradePoint tradePoint = tradePointService.showTradePointById(id);
        return tradePoint;
    }
    @PostMapping("/createTradePoint")
    @PreAuthorize("hasRole('USER') || hasRole('ADMIN')")
    public TradePoint createTradePoint(@RequestBody TradePoint tradePoint) {
        tradePointService.createTradePoint(tradePoint);
        return tradePoint;
    }

    @DeleteMapping("/deleteTradePoint/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteTradePoint(@PathVariable int id) {
        tradePointService.deleteTradePoint(id);
    }

    @GetMapping("/showTradePointsOnDate/{localDate}")
    @PreAuthorize("hasRole('USER') || hasRole('ADMIN')")
    public List<TradePoint> showTradePointsOnDate(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @PathVariable LocalDate localDate) {
        List<TradePoint> tradePoints = tradePointService.showTradePointsOnDate(localDate);
        return tradePoints;
    }

    @PostMapping("/updateTradePoint")
    @PreAuthorize("hasRole('USER') || hasRole('ADMIN')")
    public void updateTradePoint(@RequestBody TradePoint tradePoint) {
        tradePointService.createTradePoint(tradePoint);
    }
}
