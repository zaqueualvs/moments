package com.alves.backmoments.application.domain.models;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Moment {

    private Long id;
    private String title;
    private String description;
    private byte[] image;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private Set<Comment> comments = new HashSet<>();

    public Moment() {
    }

    public Moment(Long id, String title, String description, byte[] image, OffsetDateTime createdAt, OffsetDateTime updatedAt, Set<Comment> comments) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moment moment = (Moment) o;
        return Objects.equals(id, moment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
