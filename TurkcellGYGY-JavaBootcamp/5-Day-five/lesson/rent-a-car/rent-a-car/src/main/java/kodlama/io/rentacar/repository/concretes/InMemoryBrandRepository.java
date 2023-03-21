package kodlama.io.rentacar.repository.concretes;

import kodlama.io.rentacar.entities.concretes.Brand;
import kodlama.io.rentacar.repository.abstracts.BrandRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository()
    {
        brands = new ArrayList<>();
        brands.add(new Brand(1, "mazda"));
        brands.add(new Brand(1, "reno"));
        brands.add(new Brand(1, "volvo"));
        brands.add(new Brand(1, "tesla"));
        brands.add(new Brand(1, "tofaş"));



    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}