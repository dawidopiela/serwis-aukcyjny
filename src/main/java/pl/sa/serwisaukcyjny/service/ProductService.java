package pl.sa.serwisaukcyjny.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sa.serwisaukcyjny.model.Product;
import pl.sa.serwisaukcyjny.model.User;
import pl.sa.serwisaukcyjny.model.dto.ProductDto;
import pl.sa.serwisaukcyjny.repository.ProductRepository;
import pl.sa.serwisaukcyjny.repository.UserRepository;

@Service
public class ProductService {
    ProductRepository productRepository;
    UserRepository userRepository;

    @Autowired
    public ProductService(ProductRepository productRepository, UserRepository userRepository) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }

    public Product createProductByUser(ProductDto productDto){
//        User user = userRepository.findByEmail(email);
        Product product= new Product(
                productDto.getTitle(),
                productDto.getDescription(),
                productDto.getLocation(),
                productDto.getEnd_added(),
                productDto.getCategory()
        );
        return productRepository.save(product);
    }

    // delete modyfikacja dodawnaie do koszyka
}
