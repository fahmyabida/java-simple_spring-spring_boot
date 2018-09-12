package com.techtalk1.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Fahmy Abida
 * Email : fahmyabida@gmail.com
 */

@Entity
@Table(name = "post")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private User idUser;

    @Column(name = "content")
    private String content;
}
