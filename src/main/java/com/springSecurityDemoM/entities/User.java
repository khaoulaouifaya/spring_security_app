package com.springSecurityDemoM.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Data@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String lastname;
    private String mail;
    private String password;

    private boolean accountNonExpired;
    private  boolean accountNonLocked;
    private  boolean credentialsNonExpired;
    private  boolean enabled;
    @ManyToMany(fetch = FetchType.EAGER  , cascade = { CascadeType.PERSIST,CascadeType.REMOVE})
    List<Role> roles ;

}
