package tn.insat.tpmicro.productservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.insat.tpmicro.productservice.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
