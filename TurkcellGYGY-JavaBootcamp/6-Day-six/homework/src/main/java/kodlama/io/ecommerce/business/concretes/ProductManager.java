package kodlama.io.ecommerce.business.concretes;

import kodlama.io.ecommerce.business.abstracts.ProductService;
import kodlama.io.ecommerce.business.validators.ProductValidator;
import kodlama.io.ecommerce.entities.concretes.Product;
import kodlama.io.ecommerce.repository.abstracts.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    ProductRepository productRepository;

    public ProductManager(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product add(Product product) {
        ProductValidator.checkIfDescriptionLengthValid(product);
        ProductValidator.checkIfQuantityValid(product);
        ProductValidator.checkIfUnitPriceValid(product);
        return productRepository.add(product);
    }

    @Override
    public void delete(int id) {
        productRepository.delete(id);
    }

    @Override
    public Product update(int id, Product product) {
        ProductValidator.checkIfDescriptionLengthValid(product);
        ProductValidator.checkIfQuantityValid(product);
        ProductValidator.checkIfUnitPriceValid(product);
       return productRepository.update(id, product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public Product getById(int id) {
        return productRepository.getById(id);
    }
}
