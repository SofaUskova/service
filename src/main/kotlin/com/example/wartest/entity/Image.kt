package com.example.wartest.entity

import javax.persistence.*

@Entity
@Table(name = "image")
data class Image(
        @Id
        @Column(name = "id_image")
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        val idImage: Int,
        @Column(name = "url")
        val url: String,
        @ManyToOne
        @JoinColumn(name = "id_horse")
        val horse: Horse
)
