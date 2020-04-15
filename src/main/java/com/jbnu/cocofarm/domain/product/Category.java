package com.jbnu.cocofarm.domain.product;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Category
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String categoryName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category rootCategory;

    @OneToMany(mappedBy = "rootCategory", fetch = FetchType.LAZY)
    List<Category> leafCategoryList = new ArrayList<>();

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    List<Product> productList = new ArrayList<>();
}