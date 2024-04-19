package tn.insat.tpmicro.productservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.insat.tpmicro.productservice.dtos.ProductDto;
import tn.insat.tpmicro.productservice.services.ProductService;

import java.util.List;

@RestController
//@RequestMapping("/")
public class ProductController {

   private final ProductService productService;

    @Value("${me}")
    private String me;

    public ProductController(ProductService productService) {
       this.productService = productService;
    }

    @GetMapping("/")
   public List<ProductDto> getAllProducts(){
        return productService.getProductsDto();
   }

    @RequestMapping("/messages")
    public String tellMe(){
        System.out.println("c'est moi qui ai répondu!");
        return me; }
}
