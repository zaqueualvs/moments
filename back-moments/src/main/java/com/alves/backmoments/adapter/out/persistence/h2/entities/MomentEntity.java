package com.alves.backmoments.adapter.out.persistence.h2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "moment")
public class MomentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @Lob
    private byte[] image;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    @PrePersist
    private void prePersistence() {
        this.createdAt = OffsetDateTime.now();
        this.updatedAt = OffsetDateTime.now();
    }

    @PreUpdate
    private void preUpdate() {
        this.updatedAt = OffsetDateTime.now();
    }
}
