package com.amazon.app.model;


import com.amazon.app.util.ContentType;
import com.amazon.app.util.Language;

import java.util.List;
import java.util.Objects;

public class Content {

    private ContentType contentType;

    private long contentLength;

    private String contentLen;
    private String contentName;

    private String album;

    private String url;
    private List<Celebrity> celebrityList;

    private String language;

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

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public List<Celebrity> getCelebrityList() {
        return celebrityList;
    }

    public void setCelebrityList(List<Celebrity> celebrityList) {
        this.celebrityList = celebrityList;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContentLen() {
        return contentLen;
    }

    public void setContentLen(String contentLen) {
        this.contentLen = contentLen;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Content content = (Content) o;
        return contentLength == content.contentLength && contentType == content.contentType && Objects.equals(contentName, content.contentName) && Objects.equals(album, content.album) && Objects.equals(celebrityList, content.celebrityList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, contentLength, contentName, album, celebrityList);
    }
}
