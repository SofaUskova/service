package com.example.wartest.entity

import javax.persistence.*

@Entity
@Table(name = "horse")
data class Horse(
        @Id
        @Column(name = "id_horse")
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        val idHorse: Int,
        @Column(name = "name")
        val name: String,
        @Column(name = "height")
        val height: String,
        @Column(name = "year_birth")
        val yearBirth: String,
        @Column(name = "organization")
        val organization: String?,
        @Column(name = "brand")
        val brand: String?,
        @Column(name = "marks")
        val marks: String?,
        @Column(name = "mother", nullable = true)
        val mother: String?,
        @Column(name = "father", nullable = true)
        val father: String?,
        @ManyToOne
        @JoinColumn(name = "id_breed")
        val breed: Breed,
        @ManyToOne
        @JoinColumn(name = "id_color")
        val color: Color,
        @ManyToOne
        @JoinColumn(name = "id_gender")
        val gender: Gender,
        @ManyToOne
        @JoinColumn(name = "id_location")
        val location: Location,
        @Column(name = "all_inform")
        val allInform: String?
)
