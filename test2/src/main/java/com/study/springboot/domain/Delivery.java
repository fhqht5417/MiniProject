package com.study.springboot.domain;

import com.study.springboot.constant.DeliveryStatus;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Builder
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Delivery {

    @Id@GeneratedValue
    @Column(name = "DELIVERY_NUM")
    private Long delivery_num;

    @OneToOne(mappedBy = "delivery")
    private Order oder;

    private String address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
