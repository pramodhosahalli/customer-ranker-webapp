package com.rank.customerranker.entity;

import com.rank.customerranker.util.ContentType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "content_info")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "content_type")
    private ContentType contentType;

    @Column(name = "content_length")
    private long contentLength;

    @Column(name = "content_name")
    private String contentName;

    @Column(name= "created_at")
    private Timestamp createdAt;
}
