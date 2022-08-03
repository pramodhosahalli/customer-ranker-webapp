package com.amazon.app.model;

import java.util.Objects;

public class RankContentRltnp {

    private Content content;

    private long noOfHits; // no of visits per month

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public long getNoOfHits() {
        return noOfHits;
    }

    public void setNoOfHits(long noOfHits) {
        this.noOfHits = noOfHits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RankContentRltnp that = (RankContentRltnp) o;
        return noOfHits == that.noOfHits && Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, noOfHits);
    }
}
