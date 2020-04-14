package com.jbnu.cocofarm.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CategoryRepository
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // 기본 CRUD 이외에 필요한 query를 추가합니다. querydsl 참고

}