package com.alexeykuznetsov.petproject.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
@Entity
@Table(name = "tradepoints")
public class TradePoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "legal_name")
    private String legalName;
    @Column(name = "address")
    private String address;
    @Column(name = "date_of_next_visit")
    private LocalDate dateOfNextVisit;

    public TradePoint() {
    }

    public TradePoint(String name, String legalName, String address, LocalDate dateOfNextVisit) {
        this.name = name;
        this.legalName = legalName;
        this.address = address;
        this.dateOfNextVisit = dateOfNextVisit;
    }

    public TradePoint(int id, String name, String legalName, String address, LocalDate dateOfNextVisit) {
        this.id = id;
        this.name = name;
        this.legalName = legalName;
        this.address = address;
        this.dateOfNextVisit = dateOfNextVisit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfNextVisit() {
        return dateOfNextVisit;
    }

    public void setDateOfNextVisit(LocalDate dateOfNextVisit) {
        this.dateOfNextVisit = dateOfNextVisit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TradePoint)) return false;
        TradePoint that = (TradePoint) o;
        return getId() == that.getId() && Objects.equals(getName(), that.getName()) && Objects.equals(getLegalName(), that.getLegalName()) && Objects.equals(getAddress(), that.getAddress()) && Objects.equals(getDateOfNextVisit(), that.getDateOfNextVisit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getLegalName(), getAddress(), getDateOfNextVisit());
    }

    @Override
    public String toString() {
        return "TradePoint{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", legalName='" + legalName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfNextVisit=" + dateOfNextVisit +
                '}';
    }
}
