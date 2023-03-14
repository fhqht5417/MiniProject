package com.study.springboot.domain;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@Builder
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Product_id",nullable = false)
    private Long id;

    @Column(name = "product_title",nullable = false)
    private String title;

    @Column (name="product_content",columnDefinition ="TEXT",nullable = false )
    private String content;

    @Column (name = "product_updated_at",nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "product_created_at",nullable = false)
    private  LocalDateTime createdAt;

    @Column(name = "product_views",nullable = false)
    private int views;

    @Column(name = "product_like",nullable = false)
    private int like;

}
