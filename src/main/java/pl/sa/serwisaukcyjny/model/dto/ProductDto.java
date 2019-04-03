package pl.sa.serwisaukcyjny.model.dto;

import lombok.Data;
import org.hibernate.annotations.Type;
import pl.sa.serwisaukcyjny.model.Category;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class ProductDto {
    @NotNull
    private String title;
    @NotNull
    @Type(type = "text")
    private String description;
    @NotNull
    private Category category;
    @NotNull
    private String location;
    private LocalDateTime end_added;
}
