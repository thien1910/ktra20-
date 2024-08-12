package com.project.web_shopapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name= "users")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name",length = 100)
    private String fullName;
    @Column(name = "phone_number",length = 10, nullable = false)
    private String phoneNumber;
    @Column(name = "address",length = 200)
    private String address;
    @Column(name = "password",length = 200,nullable = false)
    private String password;
    private boolean active;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "facebook_account_id")
    private int faceBookAccountId;
    @Column(name = "google_account_id")
    private int googleAccountId;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private com.project.web_shopapp.models.Role role;

}
