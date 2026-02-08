package com.example.itemapi.controller;

import com.example.itemapi.service.ItemService;
import org.springframework.web.bind.annotation.*;
import com.example.itemapi.model.Item;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class controller {

    private final ItemService itemService;

    public controller (ItemService itemService){
          this.itemService = itemService;
    }

    @PostMapping("/add")
    public Item addItem(@RequestBody Item item){
             return itemService.addItem(item);
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id){
        return itemService.getElementById(id);
    }
    @GetMapping("/getAll")
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }
}
