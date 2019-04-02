package pl.sa.serwisaukcyjny.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String title;
    @NotNull
    @Type(type = "text")
    private String description;
    @NotNull
    private String category;
    @NotNull
    private String location;
    private LocalDateTime date_added=LocalDateTime.now();
    private LocalDateTime end_added;
}
