package com.example.itemapi.controller;

import com.example.itemapi.model.Item;
import com.example.itemapi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    // Add new item
    @PostMapping
    public ResponseEntity<Item> addItem(@RequestBody Item item) {
        if (item.getName() == null || item.getDescription() == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(itemService.addItem(item));
    }

    // Get item by ID
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable int id) {
        return itemService.getItemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Get all items
    @GetMapping
    public ResponseEntity<?> getAllItems() {
        return ResponseEntity.ok(itemService.getAllItems());
    }
}

