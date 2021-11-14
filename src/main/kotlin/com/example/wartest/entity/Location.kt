package com.example.wartest.entity

import javax.persistence.*

@Entity
@Table(name = "location")
data class Location(
        @Id
        @Column(name = "id_location")
        val idLocation: Int,
        @Column(name = "country")
        val country: String,
        @Column(name = "city")
        val city: String
)