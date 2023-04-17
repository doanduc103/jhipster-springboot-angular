package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.CategoryProduct;
import com.mycompany.myapp.repository.CategoryRepository;
import com.mycompany.myapp.service.dto.CategoryDTO;
import com.mycompany.myapp.service.mapper.CategoryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryService {

    CategoryRepository categoryRepository;

    CategoryMapper categoryMapper;

    private final Logger log = LoggerFactory.getLogger(CategoryService.class);

    public List<CategoryProduct> GetAllCatory() {
        return categoryRepository.findAll();
    }

    public CategoryProduct CreateNewCategoryProduct(CategoryDTO categoryDTO) {
        CategoryProduct category = new CategoryProduct();
        category = categoryMapper.CategoryDTOTocategory(categoryDTO);
        categoryRepository.save(category);
        return category;
    }

    public Optional<CategoryProduct> EditCategory(Long id, CategoryDTO categoryDTO) {
        return Optional.of(categoryRepository.findById(id)).filter(Optional::isPresent)
            .map(Optional::get).map(category -> {
                category = categoryMapper.CategoryDTOTocategory(categoryDTO);
                return category;
            });
    }

    public void DeleteCategory(Long id, CategoryProduct category){
        categoryRepository.delete(category);
    }
}
