package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Category;
import com.mycompany.myapp.domain.Product;
import com.mycompany.myapp.service.dto.CategoryDTO;
import com.mycompany.myapp.service.dto.ProductDTO;

public class CategoryMapper {

    public CategoryDTO CategoryTocategoryDTO(Category category){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setName(category.getName());
        categoryDTO.setProductList(category.getProductList());
        return categoryDTO;
    }

    public Category CategoryDTOTocategory(CategoryDTO categoryDTO){
        Category category = new Category();
        category.setName(categoryDTO.getName());
        category.setProductList(categoryDTO.getProductList());
        return category;

    }
}
