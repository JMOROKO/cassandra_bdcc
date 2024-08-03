package com.silstechnologie.cassandra_bdcc.services;

import com.silstechnologie.cassandra_bdcc.entities.Produit;
import com.silstechnologie.cassandra_bdcc.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }
    public void addUser(String name, double prix, int quantite){
        Produit produit = new Produit();
        produit.setName(name);
        produit.setPrix(prix);
        produit.setQuantite(quantite);

        produit.setId(UUID.randomUUID());

        repository.insert(produit);
    }
    public void editProduit(UUID id, String name, double prix, int quantite){
        Produit produit = repository.findById(id).orElse(null);

        if(produit ==null) throw new RuntimeException("Le produit selectionné n'existe pas");

        produit.setName(name);
        produit.setPrix(prix);
        produit.setQuantite(quantite);

        repository.insert(produit);
    }

    public void delete(UUID id){
        Produit produit = repository.findById(id).orElse(null);

        if(produit ==null) throw new RuntimeException("Le produit selectionné n'existe pas");

        repository.delete(produit);
    }

    public List<Produit> getAllUsers(){
        return repository.findAll();
    }


}
