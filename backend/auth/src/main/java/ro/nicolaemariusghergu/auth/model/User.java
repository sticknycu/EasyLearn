package ro.nicolaemariusghergu.auth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;
}
