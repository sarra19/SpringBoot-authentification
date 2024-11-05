package tn.esprit.ecodev.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "recycled_products")
public class RecycledProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String image;

    @Column(length = 1000)
    private String description;

    private int quantity;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    // Many products can have the same recycled content
    @ManyToOne
    @JoinColumn(name = "recycled_content_id")
    private RecycledContent recycledContent;

   /*@ManyToOne
    @JoinColumn(name = "sales_center_id")
    private SalesCenter salesCenter;*/


    // Constructors


}
