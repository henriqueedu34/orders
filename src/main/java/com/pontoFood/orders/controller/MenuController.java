package com.pontoFood.orders.controller;

import com.pontoFood.orders.Service.MenuService;
import com.pontoFood.orders.model.MenuItem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    //add new item
    @PostMapping
    public ResponseEntity<MenuItem> createMenuItem (@RequestBody MenuItem menuItem){
        MenuItem createMenuItem = menuService.createMenuItem(menuItem);
        return new ResponseEntity<>(menuItem, HttpStatus.valueOf("Add list"));
    }
    @GetMapping
    public ResponseEntity<List<MenuItem>> getAllItens (){
        return ResponseEntity.ok(menuService.getAllItens());
    }
}
