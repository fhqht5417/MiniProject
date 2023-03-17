package com.study.springboot.domain;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Getter
@Entity
@Builder
@DynamicUpdate
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "notice_num",nullable = false)
    private Long notice_num;

    @Column(name = "notice_title",nullable = false)
    private String title; // 공지사항 제목

    @Column (name="notice_content",columnDefinition ="TEXT",nullable = false )
    private String content;  // 글 내용

    @Column(name = "notice_created_at",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  LocalDateTime createdAt; // 작성 날짜

    @Column(name = "notice_views",nullable = false)
    private int views; // 조회수


}
