package tn.insat.tpmicro.productservice.services;

import org.springframework.stereotype.Service;
import tn.insat.tpmicro.productservice.dtos.ProductDto;
import tn.insat.tpmicro.productservice.entites.Product;

import java.util.List;

public interface ProductService {
    ProductDto saveProduct(ProductDto productDto);

    List<ProductDto> getProductsDto();

    List<Product> getProducts();
}
