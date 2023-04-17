package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.domain.FileUploadUtils;
import com.mycompany.myapp.domain.Product;
import com.mycompany.myapp.repository.ProductRepository;
import com.mycompany.myapp.security.AuthoritiesConstants;
import com.mycompany.myapp.service.ProductSerivce;
import com.mycompany.myapp.service.dto.ProductDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.security.auth.login.LoginException;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class ProductApiResource {

    private final Logger log = LoggerFactory.getLogger(ProductApiResource.class);

    ProductRepository productRepository;

    ProductSerivce productSerivce;

    FileUploadUtils fileUploadUtils;

    @GetMapping("/product")
    public ResponseEntity<Page<Product>> FindAllProductByPaging(Pageable pageable) {
        log.debug("Find All Product Pageable");
        Page<Product> productPageable = productSerivce.FindAllProductByPaging(pageable);
        return ResponseEntity.ok(productPageable);
    }


    @PostMapping("/product/create")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public ResponseEntity<?> CreateProduct(@RequestBody ProductDTO productDTO
        ,@RequestParam("Image") MultipartFile [] Product_Images) throws LoginException, IOException {
        log.debug("Start Create Product " + productDTO);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null) {
            throw new LoginException("No account login ");
        }
        fileUploadUtils.ConvertImage(Product_Images,productDTO);
        productSerivce.CreateProductFromUser(productDTO);
        return ResponseEntity.ok("Create Product " + productDTO.getId());
    }

    @PutMapping("/product/edit/{id}")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public ResponseEntity<?> EditProductById(@PathVariable Long id , ProductDTO productDTO) throws LoginException {
        log.debug("Start Edit Product " + productDTO);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null) {
            throw new LoginException("No account login ");
        }
        productSerivce.UpdateProductById(id,productDTO);
        return ResponseEntity.ok("Edit Product " + productDTO.getId());
    }


    @DeleteMapping("/product/delete/{id}")
    @PreAuthorize("hasAuthority(\"" + AuthoritiesConstants.ADMIN + "\")")
    public ResponseEntity<?> DeleteProductById(@PathVariable Long id , ProductDTO productDTO) throws LoginException, IOException {
        log.debug("Start delete Product " + productDTO);
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null) {
            throw new LoginException("No account login ");
        }
        fileUploadUtils.DeleteDirUploadFile(productDTO);
        productSerivce.DeleteProductById(id);
        return ResponseEntity.ok("Detele Product " + productDTO.getId());
    }
}
