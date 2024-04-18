package tn.insat.tpmicro.productservice.Mappers;

import org.springframework.beans.BeanUtils;
import tn.insat.tpmicro.productservice.dtos.ProductDto;
import tn.insat.tpmicro.productservice.entites.Product;

public class ProductMapper {

    public static ProductDto toProductDto(Product product){
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);

        return productDto;
    }


    public static Product toProductEntity(ProductDto productDto){
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return product;
    }


}
