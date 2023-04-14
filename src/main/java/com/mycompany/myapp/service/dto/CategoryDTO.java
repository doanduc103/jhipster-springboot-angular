package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.domain.AbstractAuditingEntity;
import com.mycompany.myapp.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO extends AbstractAuditingEntity {

    private Long id;

    private String name;

    private List<Product> productList;

}
