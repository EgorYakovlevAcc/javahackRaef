package com.javahack.demo.models;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "bankcard")
public class BankCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;  //почему не int?
    //потому что hibernate умеет работать только с классами объектов, а int - примитив
    //поэтому юзаем объект Integer
    private User cardHolder;
    private String cardNumber;
    private Date expirationDate;
    private String cvc;
    private Long balance;

    public BankCard() {

    }

    public BankCard(Integer id, User cardHolder, String cardNumber, Date expirationDate, String cvc) {
        this.id = id;
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvc = cvc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(User cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }
}
