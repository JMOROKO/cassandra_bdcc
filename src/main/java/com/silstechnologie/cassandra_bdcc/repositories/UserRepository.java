package com.silstechnologie.cassandra_bdcc.repositories;

import com.silstechnologie.cassandra_bdcc.entities.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface UserRepository extends CassandraRepository<User, UUID> {

}
