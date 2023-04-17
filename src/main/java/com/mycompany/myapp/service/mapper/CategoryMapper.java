package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.CategoryProduct;
import com.mycompany.myapp.domain.CategoryProduct;
import com.mycompany.myapp.domain.Product;
import com.mycompany.myapp.service.dto.CategoryDTO;
import com.mycompany.myapp.service.dto.ProductDTO;

public class CategoryMapper {

    public CategoryDTO CategoryTocategoryDTO(CategoryProduct categoryProduct){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName(categoryProduct.getName());
        categoryDTO.setProductList(categoryProduct.getProductList());
        return categoryDTO;
    }

    public CategoryProduct CategoryDTOTocategory(CategoryDTO categoryDTO){
        CategoryProduct category = new CategoryProduct();
        category.setName(categoryDTO.getName());
        category.setProductList(categoryDTO.getProductList());
        return category;

    }
}
