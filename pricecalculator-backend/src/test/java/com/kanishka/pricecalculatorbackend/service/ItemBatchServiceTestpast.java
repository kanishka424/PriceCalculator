//package com.kanishka.pricecalculatorbackend.service;
////
////import com.kanishka.pricecalculatorbackend.model.ItemBatch;
////import com.kanishka.pricecalculatorbackend.repository.ItemBatchRepository;
////import com.kanishka.pricecalculatorbackend.repository.ItemRepository;
////import org.junit.Test;
////import org.junit.runner.RunWith;
////import org.springframework.beans.factory.annotation.Autowired;
////
//import com.kanishka.pricecalculatorbackend.model.Item;
//import com.kanishka.pricecalculatorbackend.model.ItemBatch;
//import com.kanishka.pricecalculatorbackend.repository.ItemRepository;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.Optional;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//public class ItemBatchServiceTestpast {
////    @InjectMocks
////    ItemBatchService itemBatchService;
////
////
//////    @Mock
//////    public ItemRepository itemRepository;
////
////    @InjectMocks
////    ItemBatch itemBatch;
//    @MockBean
//    @Autowired
//    public ItemRepository itemRepository;
//
////    ItemRepository itemRepository = mock(ItemRepository.class);
//
//
//    @Before
//    public void init() {
//
//        Item item = new Item(1,"PE", "Penguine Ears", 175.0, 0.1, 0.3, 3, 20);
//
//
//        when(itemRepository.findById("PE")).thenReturn(Optional.of(item));
//
//
//
//    }
//
//
//
//
////    @Test
//    public void serviceTest(){
//
//   ItemBatchService itemBatchService=new ItemBatchService(itemBatchRepository, itemRepository);
//       ItemBatch itemBatch=new ItemBatch();
//        itemBatch.setItemCode("PE");
//        itemBatch.setTotalUnits(1);
//        itemBatch.setNoOfCartons(0);
//        itemBatch.setNoOfSingleUnits(1);
//        itemBatchService.addItemBatch(itemBatch);
//        assertEquals(11.375,itemBatchService.addItemBatch(itemBatch).getPrice());
//    }
//}
