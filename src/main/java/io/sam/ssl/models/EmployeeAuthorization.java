package io.sam.ssl.models;

import lombok.Data;
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
public class EmployeeAuthorization implements Serializable {
    private static final long serialVersionUID = -454273133537864504L;
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

}
