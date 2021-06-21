package com.kanishka.pricecalculatorbackend.service

import com.kanishka.pricecalculatorbackend.model.Item
import com.kanishka.pricecalculatorbackend.model.ItemBatch
import com.kanishka.pricecalculatorbackend.repository.ItemBatchRepository
import com.kanishka.pricecalculatorbackend.repository.ItemRepository
import spock.lang.Specification

class ItemBatchServiceTest extends Specification {

    def itemRepository=Mock(ItemRepository);
    def itemBatchRepository=Mock(ItemBatchRepository);
    def itemBatchService=new ItemBatchService(itemBatchRepository,itemRepository);
    def "saving ItemBatch Test Case"() {
        given:
        def item = new Item(1,"PE", "Penguine Ears", 175.0, 0.1, 0.3, 3, 20);
        def itemBatch=new ItemBatch();
        itemBatch.setItemCode("PE");
        itemBatch.setTotalUnits(1);
        itemBatch.setNoOfCartons(0);
        itemBatch.setNoOfSingleUnits(1)

        and:
        itemRepository.findById("PE") >> Optional.of(item);
        itemBatchRepository.save(itemBatch) >> itemBatch


        when:
        def getResult=itemBatchService.addItemBatch(itemBatch)

        then:

        getResult.getPrice()==11.375
    }
}
