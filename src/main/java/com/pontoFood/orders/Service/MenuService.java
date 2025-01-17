package com.pontoFood.orders.Service;

import com.pontoFood.orders.repository.MenuRepository;
import com.pontoFood.orders.model.MenuItem;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {
    private final MenuRepository menuRepository;


    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    //Add item
    public MenuItem createMenuItem (MenuItem menuItem){
        return menuRepository.save(menuItem);
    }
    //List all itens
    public List<MenuItem> getAllItens (){
        return menuRepository.findAll();
    }

    //List item
    public Optional<MenuItem> getItemId(@PathVariable long id){
        return menuRepository.findById(id);
    }
}
