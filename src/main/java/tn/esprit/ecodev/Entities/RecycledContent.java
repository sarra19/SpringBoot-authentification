package tn.esprit.ecodev.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "recycled_contents")
public class RecycledContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer percentage; // assuming you want this as an integer

    private String contentDescription;



    // Getters and Setters
}