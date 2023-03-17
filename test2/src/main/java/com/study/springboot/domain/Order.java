package com.study.springboot.domain;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Builder
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Order {
    @Id @GeneratedValue
    @Column (name="oder_num")
    private Long oder_num;
    @ManyToOne
    @JoinColumn (name = "user_num")
    private Member member; //주문회원

    @OneToMany(mappedBy = "order")
    private List<Product> products =
            new ArrayList<Product>();
    // 주문(1):상품(N)
    // 상품정보
    @Column(name = "quantity",nullable = false)
    private String quantity;
    //주문수량(quantity)
    @Column(name = "oderPrice",nullable = false)
    private String oderPrice;
    //주문금액(price)

    @OneToOne
    @JoinColumn(name = "DELIVERY_NUM")
    private Delivery delivery; // 배송정보

    @Column(name = "OrderDate",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDate; // 주문시간





}
