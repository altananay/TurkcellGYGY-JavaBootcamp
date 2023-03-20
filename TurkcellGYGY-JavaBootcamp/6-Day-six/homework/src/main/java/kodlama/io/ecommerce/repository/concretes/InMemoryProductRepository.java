package kodlama.io.ecommerce.repository.concretes;

import kodlama.io.ecommerce.entities.concretes.Product;
import kodlama.io.ecommerce.repository.abstracts.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProductRepository implements ProductRepository {

    List<Product> products;

    public InMemoryProductRepository()
    {
        products = new ArrayList<>();
        products.add(new Product(1, "iphone 15", 5, 50000, "iphone telefon"));
        products.add(new Product(2, "ps5", 10, 20000, "sony playstation 5"));
    }

    @Override
    public Product add(Product product) {
        products.add(product);
        return product;
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

    @Override
    public Product update(int id, Product product) {
        return products.set(id -1 , product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(int id) {
        return products.get(id-1);
    }
}
