package com.fintrackr.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;

    @Lob
    private String content;

    private LocalDate generatedDate;

    public Report(String userId, String content, LocalDate generatedDate) {
        this.userId = userId;
        this.content = content;
        this.generatedDate = generatedDate;
    }
}
