package com.study.springboot.domain;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Builder
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member {
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long user_num;

    @GeneratedValue
    @Column(name="member_id", nullable=false)
    private String member_id;

    @Column(name = "member_password", nullable = false)
    private String password;

    @Column(name = "member_name",nullable = false)
    private String name;

    @Column(name = "member_address",nullable = false)
    private String address;



}
