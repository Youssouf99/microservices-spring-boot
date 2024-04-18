package tn.insat.tpmicro.productservice.services;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import tn.insat.tpmicro.productservice.dtos.ProductDto;
import tn.insat.tpmicro.productservice.entites.Product;
import tn.insat.tpmicro.productservice.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

import static tn.insat.tpmicro.productservice.Mappers.ProductMapper.toProductDto;
import static tn.insat.tpmicro.productservice.Mappers.ProductMapper.toProductEntity;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public ProductDto saveProduct(ProductDto productDto){
        Product product = toProductEntity(productDto);
        Product savedProduct = productRepository.save(product);
        return toProductDto(savedProduct);
    }

    @Override
    public List<ProductDto> getProductsDto(){
        return productRepository.findAll()
                .stream().map(product -> toProductDto(product))
                .collect(Collectors.toList());
    }

    @Override
    public List<Product> getProducts(){
        return productRepository.findAll();

    }



}
