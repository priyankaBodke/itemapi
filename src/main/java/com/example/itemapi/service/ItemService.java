package com.example.itemapi.service;


import com.example.itemapi.model.Item;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    private List<Item> items = new ArrayList<>();
    private int nextId = 1;

    // Add new item
    public Item addItem(Item item) {
        item.setId(nextId++);
        items.add(item);
        return item;
    }

    // Get item by ID
    public Optional<Item> getItemById(int id) {
        return items.stream().filter(i -> i.getId() == id).findFirst();
    }

    // Get all items
    public List<Item> getAllItems() {
        return items;
    }
}

