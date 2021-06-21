package com.kanishka.pricecalculatorbackend.service;


import com.kanishka.pricecalculatorbackend.exception.ResourceNotFoundException;
import com.kanishka.pricecalculatorbackend.model.Item;
import com.kanishka.pricecalculatorbackend.model.ItemBatch;
import com.kanishka.pricecalculatorbackend.repository.ItemBatchRepository;
import com.kanishka.pricecalculatorbackend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemBatchService {



    public  final ItemBatchRepository itemBatchRepository;


    public final ItemRepository itemRepository;

    @Autowired
    public ItemBatchService(ItemBatchRepository itemBatchRepository, ItemRepository itemRepository) {
        this.itemBatchRepository = itemBatchRepository;
        this.itemRepository = itemRepository;
    }


    public ItemBatch addItemBatch(ItemBatch itemBatch){


        double price=0.0;
        int totalUnits=0;
        System.out.println();
        if(itemBatch.getItemCode().equals("PE")){
            Item penguinEarItem=itemRepository
                    .findById("PE")
                    .orElseThrow(() -> new ResourceNotFoundException("Item not exist with code :PE"  ));
            if(itemBatch.getNoOfCartons()>3){
//                price = (itemBatch.getNoOfCartons() * penguinEarItem.getCartonPrice())-(itemBatch.getNoOfCartons() *  penguinEarItem.getCartonPrice()*penguinEarItem.getDiscount()) + itemBatch.getNoOfSingleUnits()*((penguinEarItem.getCartonPrice()/ penguinEarItem.getNumOfUnitsPerCarton()) * (1.3));
                price = (itemBatch.getNoOfCartons() * penguinEarItem.getCartonPrice())-(itemBatch.getNoOfCartons() *  penguinEarItem.getCartonPrice()*penguinEarItem.getDiscount()) + itemBatch.getNoOfSingleUnits()*((penguinEarItem.getCartonPrice()/ penguinEarItem.getNumOfUnitsPerCarton()) + (penguinEarItem.getCartonPrice()/ penguinEarItem.getNumOfUnitsPerCarton())*penguinEarItem.getSingleUnitPriceIncrease());

            }else {
                price = (itemBatch.getNoOfCartons() * penguinEarItem.getCartonPrice())+itemBatch.getNoOfSingleUnits()*((penguinEarItem.getCartonPrice()/ penguinEarItem.getNumOfUnitsPerCarton()) + (penguinEarItem.getCartonPrice()/ penguinEarItem.getNumOfUnitsPerCarton())*penguinEarItem.getSingleUnitPriceIncrease());
            }
             totalUnits=itemBatch.getNoOfSingleUnits()+(itemBatch.getNoOfCartons()*20);


        }else if(itemBatch.getItemCode().equals("HS")){
            Item horseShoeItem=itemRepository.findById("HS").orElseThrow(() -> new ResourceNotFoundException("Item not exist with code:HS"  ));
            if(itemBatch.getNoOfCartons()>3){
                price = (itemBatch.getNoOfCartons() * horseShoeItem.getCartonPrice())-(itemBatch.getNoOfCartons() *  horseShoeItem.getCartonPrice()*horseShoeItem.getDiscount()) +itemBatch.getNoOfSingleUnits()*((horseShoeItem.getCartonPrice()/ horseShoeItem.getNumOfUnitsPerCarton()) + (horseShoeItem.getCartonPrice()/ horseShoeItem.getNumOfUnitsPerCarton())*horseShoeItem.getSingleUnitPriceIncrease());
            }else {
                price = (itemBatch.getNoOfCartons() * horseShoeItem.getCartonPrice())+ itemBatch.getNoOfSingleUnits()*((horseShoeItem.getCartonPrice()/ horseShoeItem.getNumOfUnitsPerCarton()) + (horseShoeItem.getCartonPrice()/ horseShoeItem.getNumOfUnitsPerCarton())*horseShoeItem.getSingleUnitPriceIncrease());
            }

            totalUnits=itemBatch.getNoOfSingleUnits()+(itemBatch.getNoOfCartons()*5);
        }

        itemBatch.setTotalUnits(totalUnits);
        itemBatch.setPrice(price);
        return itemBatchRepository.save(itemBatch);
    }















//
//    public ItemBatch addItemBatch(ItemBatch itemBatch){
//
//
//        double price=0.0;
//        int totalUnits=0;
//        System.out.println();
//        if(itemBatch.getItemCode().equals("PE")){
//            Item penguinEarItem=itemRepository.getById((long) 1);
//            if(itemBatch.getNoOfCartons()>3){
//                price = (itemBatch.getNoOfCartons() * 175.0)-(itemBatch.getNoOfCartons() * 175*0.1) + itemBatch.getNoOfSingleUnits()*((175.0 / 20) * (1.3));
//            }else {
//                price = (itemBatch.getNoOfCartons() * 175.0) + itemBatch.getNoOfSingleUnits()*((175.0/ 20) * (1.3));
//            }
//            totalUnits=itemBatch.getNoOfSingleUnits()+(itemBatch.getNoOfCartons()*20);
//
//
//        }else if(itemBatch.getItemCode().equals("HS")){
//            Item horseShoeItem=itemRepository.getById((long) 2);
//            if(itemBatch.getNoOfCartons()>3){
//                price = (itemBatch.getNoOfCartons() * 825.0)-(itemBatch.getNoOfCartons() * 825*0.1) +itemBatch.getNoOfSingleUnits()* ((825.0 / 5) * (1.3));
//            }else {
//                price = (itemBatch.getNoOfCartons() * 825.0) + itemBatch.getNoOfSingleUnits()*((825.0 / 5) * (1.3));
//            }
//
//            totalUnits=itemBatch.getNoOfSingleUnits()+(itemBatch.getNoOfCartons()*5);
//        }
//
//        itemBatch.setTotalUnits(totalUnits);
//        itemBatch.setPrice(price);
//        return itemBatchRepository.save(itemBatch);
//    }

}
