package pl.sa.serwisaukcyjny.model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "Cart_Product", joinColumns = @JoinColumn(name="shoppingcart_id"), inverseJoinColumns = @JoinColumn(name="product_id"))
    List<Product> products = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "shoppingCart")
    private Set<User> user= new HashSet<>();

    public void addProduct(Product product){
        products.add(product);
    }
}
