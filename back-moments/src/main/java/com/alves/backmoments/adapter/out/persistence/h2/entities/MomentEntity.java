package com.alves.backmoments.adapter.out.persistence.h2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private String image;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    @OneToMany
    private Set<CommentEntity> comments = new HashSet<>();
}
