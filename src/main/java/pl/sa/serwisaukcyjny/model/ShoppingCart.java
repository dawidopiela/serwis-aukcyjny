package pl.sa.serwisaukcyjny.model;


import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class ShoppingCart {
    private Long count;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "ShoppingCart")
    private Set<User> user= new HashSet<>();
}
