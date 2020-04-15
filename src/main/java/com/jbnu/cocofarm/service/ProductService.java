package com.jbnu.cocofarm.service;

import java.util.List;

import com.jbnu.cocofarm.domain.product.Product;
import com.jbnu.cocofarm.domain.product.ProductDetail;
import com.jbnu.cocofarm.domain.user.Seller;

/**
 * ProductService
 */
public interface ProductService {
    void registerProduct(Product product, Integer stockNumber);

    void updateProduct(Product product);

    void deleteProduct(Long productId);

    Product searchProductById(Long productId);

    List<Product> getAllProducts();

    List<Product> searchProductByName(String searchKeyword);

    List<Product> searchProductBySeller(Seller seller);

    // productDetail 부분

    ProductDetail searchProductDetailById(Long productDetailId);
}