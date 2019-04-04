package pl.sa.serwisaukcyjny.model.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class UserDto {
    @NotBlank(message = "Insert your name")
    private String name;
    @NotBlank(message = "Insert your lastname")
    private String lastname;
    @NotBlank(message = "Insert your email")
    @Email(message = "Your email is not valid")
    private String email;
    @Length(min = 6, message = "Your password requires at least 6 characters")
//    @Pattern(regexp = "([A-Za-z]+.*[0-9]+|[0-9]+.*[A-Za-z])", message = "Your password must have one capital letter and one digit")
    private String password;
    @NotNull
    private String city;
}
