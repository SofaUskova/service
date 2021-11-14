package com.example.wartest.entity

import javax.persistence.*

@Entity
@Table(name = "specialization")
data class Specialization(
        @Id
        @Column(name = "id_specialization")
        val idSpecialization: Int,
        @Column(name = "type_specialization")
        val typeSpecialization: String
)
