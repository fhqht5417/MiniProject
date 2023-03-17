package com.study.springboot.domain;

import com.study.springboot.constant.ProductSellStatus;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
@Getter
@Builder
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Product {

    @Id
    @Column(name = "product_num")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long p_num;
    @Column(name = "Product_name",nullable = false)
    private String p_name; //상품명
    @Column(name = "price",nullable = false)
    private int price; // 가격
    @Column(name = "stockNumber",nullable = false)
    private int stockNumber; // 재고량
    @Lob // BOLB,CLOB타입 맵핑
    @Column(name = "productDtail",nullable = false)
    private String productDtail;

    @Enumerated(EnumType.STRING)
    private ProductSellStatus ProproductSellStatus; //상품 재고상태
    @Column(name = "regTime",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime regTime;

    @Column(name = "updateTime",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime updateTime;



}
