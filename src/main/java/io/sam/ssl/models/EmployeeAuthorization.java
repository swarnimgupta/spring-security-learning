package io.sam.ssl.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Authorization table details about the columns names and what constraints are there
 */
@Entity(name = "employee_authorization_data")
@Data
@NoArgsConstructor
public class EmployeeAuthorization implements Serializable {

    private static final long serialVersionUID = 454273133537864504L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String name;
    @Email
    @NaturalId
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String role;

    public EmployeeAuthorization(@NotNull String name
            , @Email @NotNull String email
            , @NotNull String password
            , @NotNull String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
