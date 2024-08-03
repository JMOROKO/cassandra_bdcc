package com.silstechnologie.cassandra_bdcc.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("utilisateur") //anotation cassandra
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class User {
    @PrimaryKey //anotation cassandra
    private UUID id;
    private String name;
    private int age;
    private String email;
}
