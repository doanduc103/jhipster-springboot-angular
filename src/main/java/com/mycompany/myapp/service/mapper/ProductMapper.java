package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Product;
import com.mycompany.myapp.service.dto.ProductDTO;

public class ProductMapper {

    public ProductDTO ProductToProductDTO(Product product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProduct_name(product.getProduct_name());
        productDTO.setDate_added(product.getDate_added());
        productDTO.setPrice(product.getPrice());
        productDTO.setDescription(product.getDescription());
        productDTO.setQuantity(product.getQuantity());
        productDTO.setImage(product.getImage());
        productDTO.setStatus(product.isStatus());
        return productDTO;
    }

    public Product ProductDTOtoProduct(ProductDTO productDTO){
        Product product = new Product();
        product.setProduct_name(productDTO.getProduct_name());
        product.setDate_added(productDTO.getDate_added());
        product.setPrice(productDTO.getPrice());
        product.setDescription(productDTO.getDescription());
        product.setQuantity(productDTO.getQuantity());
        product.setImage(productDTO.getImage());
        product.setStatus(productDTO.isStatus());
        return product;

    }

}
