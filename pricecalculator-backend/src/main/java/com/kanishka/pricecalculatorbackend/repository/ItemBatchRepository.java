package com.kanishka.pricecalculatorbackend.repository;

import com.kanishka.pricecalculatorbackend.model.Item;
import com.kanishka.pricecalculatorbackend.model.ItemBatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemBatchRepository extends JpaRepository<ItemBatch,Long> {
}
