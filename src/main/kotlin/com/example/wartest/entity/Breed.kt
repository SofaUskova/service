package com.example.wartest.entity

import javax.persistence.*

@Entity
@Table(name = "breed")
data class Breed(
        @Id
        @Column(name = "id_breed")
        val idBreed: Int,
        @Column(name = "breed")
        val breed: String
)
