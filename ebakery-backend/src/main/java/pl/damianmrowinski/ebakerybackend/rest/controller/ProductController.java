package pl.damianmrowinski.ebakerybackend.rest.controller;

import org.springframework.web.bind.annotation.*;
import pl.damianmrowinski.ebakerybackend.app.service.product.ProductDetailsService;
import pl.damianmrowinski.ebakerybackend.app.service.product.ProductListService;
import pl.damianmrowinski.ebakerybackend.dto.ProductDetailsDto;
import pl.damianmrowinski.ebakerybackend.dto.ProductListDto;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
@CrossOrigin
public class ProductController {

    private final ProductDetailsService productDetailsService;
    private final ProductListService productListService;

    public ProductController(ProductDetailsService productDetailsService, ProductListService productListService) {
        this.productDetailsService = productDetailsService;
        this.productListService = productListService;
    }

    @GetMapping("/findByCategoryId")
    public List<ProductListDto> findByCategoryId(@RequestParam(name = "categoryId") Long categoryId) {
        return productListService.findByCategoryId(categoryId);
    }

    @GetMapping("/findByNameContaining")
    public List<ProductListDto> findByNameContaining(@RequestParam(name = "name") String name) {
        return productListService.findByNameContaining(name);
    }

    @GetMapping("/{productId}")
    public ProductDetailsDto findByProductId(@PathVariable Long productId) {
        return productDetailsService.findByProductId(productId);
    }

}
