package com.example.itemapi.service;

import com.example.itemapi.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    private List<Item> items = new ArrayList<>();
    private long idCounter = 1;

    public ItemService(){
        Item item1 = new Item();
        item1.setId(idCounter++);
        item1.setName("Laptop");
        item1.setDescription("asus tuf F15");

        Item item2 = new Item();
        item2.setId(idCounter++);
        item2.setName("Mobile");
        item2.setDescription("Iphone 15");

        items.add(item1);
        items.add(item2);
    }


    public Item addItem(Item item){
        item.setId(idCounter);
        idCounter++;
        items.add(item);
        return item;
    }

    public Item getElementById(Long id){
        for(Item item :items){
             if(item.getId().equals(id)){
                 return item;
             }
        }
        return null;
    }
   public List<Item> getAllItems(){
        return items;
   }
}
