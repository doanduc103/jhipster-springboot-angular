package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Product;
import com.mycompany.myapp.repository.ProductRepository;
import com.mycompany.myapp.service.dto.ProductDTO;
import com.mycompany.myapp.service.mapper.ProductMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductSerivce {

    private final Logger log = LoggerFactory.getLogger(ProductSerivce.class);

    ProductRepository productRepository;

    ProductMapper productMapper;

    public Page<Product> FindAllProductByPaging(Pageable pageable){
        return productRepository.findAll(pageable);
    }

    public Product CreateProductFromUser(ProductDTO productDTO) {
        Product product = productMapper.ProductDTOtoProduct(productDTO);
        productRepository.save(product);
        return product;
    }

    public Optional<Product> UpdateProductById(Long id,ProductDTO productDTO) {
        return Optional.of(productRepository.findById(id))
            .filter(Optional::isPresent).map(Optional::get).map(product -> {
                product = productMapper.ProductDTOtoProduct(productDTO);
                log.debug("Update Product By ID" + product.getId());
                return productRepository.save(product);
            });
    }

    public Optional<Product> DeleteProductById(Long id) {
        return Optional.of(productRepository.findById(id))
            .filter(Optional::isPresent).map(Optional::get).map(product -> {
                productRepository.delete(product);
                return product;
            });
    }
}
