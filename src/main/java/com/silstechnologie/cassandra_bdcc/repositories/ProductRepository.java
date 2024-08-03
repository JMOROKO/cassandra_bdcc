package com.silstechnologie.cassandra_bdcc.repositories;

import com.silstechnologie.cassandra_bdcc.entities.Produit;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Produit, UUID> {

}
