package com.jbnu.cocofarm.repository;

import com.jbnu.cocofarm.domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // 기본 CRUD 이외에 필요한 query를 추가합니다. querydsl 참고
}