package tn.insat.tpmicro.productservice.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tn.insat.tpmicro.productservice.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("select p from Product p where p.name like :name")
    Page<Product> productByName(@Param("name") String name, Pageable pageable);

    Page<Product> findByNameIsLike(String name, Pageable pageable);
}
