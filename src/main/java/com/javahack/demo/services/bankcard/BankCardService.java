package com.javahack.demo.services.bankcard;

import com.javahack.demo.models.BankCard;

public interface BankCardService {
    void save(BankCard bankCard);
    void delete (BankCard bankCard);

    BankCard findBankCardById(Integer id);
}
