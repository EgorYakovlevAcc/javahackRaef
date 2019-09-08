package com.javahack.demo.services.bankcard;

import com.javahack.demo.models.BankCard;
import com.javahack.demo.repos.BankCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankCardServiceImpl implements BankCardService {
    @Autowired
    private BankCardRepository bankCardRepository;

    public BankCardServiceImpl () {

    }

    @Override
    public void save(BankCard bankCard) {
        bankCardRepository.save(bankCard);
    }

    @Override
    public void delete(BankCard bankCard) {
        bankCardRepository.delete(bankCard);
    }

    @Override
    public BankCard findBankCardById(Integer id) {
        return bankCardRepository.findBankCardById(id);
    }
}
