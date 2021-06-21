package com.kanishka.pricecalculatorbackend.controller;


import com.kanishka.pricecalculatorbackend.model.ItemBatch;
import com.kanishka.pricecalculatorbackend.repository.ItemBatchRepository;
import com.kanishka.pricecalculatorbackend.service.ItemBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class ItemController {


//    @Autowired
//    private ItemBatchRepository itemBatchRepository;
//
//    @Autowired
//    private ItemBatchService itemBatchService;



    private final  ItemBatchRepository itemBatchRepository;


    private final ItemBatchService itemBatchService;

    @Autowired
    public ItemController(ItemBatchRepository itemBatchRepository, ItemBatchService itemBatchService) {
        this.itemBatchRepository = itemBatchRepository;
        this.itemBatchService = itemBatchService;
    }


    //get al item Batches
    @GetMapping("/items")
    public List<ItemBatch> getAllItemBatches(){
        System.out.println("getAllItemBatches() called");
        return itemBatchRepository.findAll();
    }

    // create itemBatch
    @PostMapping("/items")
    public ItemBatch createItemBatch(@RequestBody ItemBatch itemBatch) {
//        return itemBatchRepository.save(itemBatch);

        return itemBatchService.addItemBatch(itemBatch);
    }

}
