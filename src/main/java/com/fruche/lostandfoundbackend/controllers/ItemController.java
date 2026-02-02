package com.fruche.lostandfoundbackend.controllers;

import com.fruche.lostandfoundbackend.payload.ItemDTO;
import com.fruche.lostandfoundbackend.payload.ItemResponse;
import com.fruche.lostandfoundbackend.services.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public ResponseEntity<ItemResponse> createItem(@RequestBody ItemDTO itemDTO) {
        return new ResponseEntity<>(this.itemService.createItem(itemDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ItemResponse>> getItems() {
        return new ResponseEntity<>(this.itemService.findAllItems(), HttpStatus.OK);
    }
}
