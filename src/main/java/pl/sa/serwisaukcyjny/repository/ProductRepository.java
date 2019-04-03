package pl.sa.serwisaukcyjny.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sa.serwisaukcyjny.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long > {
}
