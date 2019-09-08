package com.javahack.demo.repos;

import com.javahack.demo.models.BankCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankCardRepository extends JpaRepository<BankCard, Integer> {
    BankCard findBankCardById(Integer id);
}
