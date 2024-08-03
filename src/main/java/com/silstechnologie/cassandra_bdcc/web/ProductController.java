package com.silstechnologie.cassandra_bdcc.web;

import com.silstechnologie.cassandra_bdcc.entities.Produit;
import com.silstechnologie.cassandra_bdcc.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService service;


    public ProductController(ProductService userService) {
        this.service = userService;
    }

    @GetMapping
    public List<Produit> getUsers(){
        return service.getAllUsers();
    }

    @PostMapping
    public String saveUser(@RequestParam String name, @RequestParam double prix, @RequestParam int quantite){
        service.addUser(name, prix, quantite);
        return "Produit is saved";
    }
    @PutMapping
    public String edit(@RequestParam UUID id, @RequestParam String name, @RequestParam double prix, @RequestParam int quantite){
        service.editProduit(id, name, prix, quantite);
        return "Produit is updated";
    }
    @DeleteMapping
    public String delete(@RequestParam UUID id){
        service.delete(id);
        return "Produit is deleted";
    }
}
