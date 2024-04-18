package tn.insat.tpmicro.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tn.insat.tpmicro.productservice.dtos.ProductDto;
import tn.insat.tpmicro.productservice.services.ProductService;

import java.util.stream.Stream;

@Component
public class DummyDataCLR implements CommandLineRunner {

    @Autowired
    private ProductService productService;
    @Override
    public void run(String... args) throws Exception {
        Stream.of("Pencil", "Book", "Eraser")
                .forEach(name -> productService.
                        saveProduct(new ProductDto(name)));

        productService.getProducts().forEach(
                product -> System.out.println(product.getName())
        );
    }
}
