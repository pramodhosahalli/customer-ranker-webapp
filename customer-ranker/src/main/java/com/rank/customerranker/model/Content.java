package com.rank.customerranker.model;

import com.rank.customerranker.util.ContentType;

import java.sql.Timestamp;

public class Content {

    private ContentType contentType;

    private long contentLength;

    private String contentName;

    private Timestamp createdAt;

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public long getContentLength() {
        return contentLength;
    }

    public void setContentLength(long contentLength) {
        this.contentLength = contentLength;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }
}
