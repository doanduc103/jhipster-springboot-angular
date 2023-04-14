package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Category;
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

    public List<Category> GetAllCatory() {
        return categoryRepository.findAll();
    }

    public Category CreateNewCategory(CategoryDTO categoryDTO) {
        Category category = new Category();
        category = categoryMapper.CategoryDTOTocategory(categoryDTO);
        categoryRepository.save(category);
        return category;
    }

    public Optional<Category> EditCategory(Long id, CategoryDTO categoryDTO) {
        return Optional.of(categoryRepository.findById(id)).filter(Optional::isPresent)
            .map(Optional::get).map(category -> {
                category = categoryMapper.CategoryDTOTocategory(categoryDTO);
                return category;
            });
    }

    public void DeleteCategory(Long id, Category category){
        categoryRepository.delete(category);
    }
}
