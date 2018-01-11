package com.example.cwh.user.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author cwh
 */
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private Integer age;
}
