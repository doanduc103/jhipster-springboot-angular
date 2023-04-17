package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.CategoryProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryProduct,Long> {
}
