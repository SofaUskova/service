package com.example.wartest.entity

import javax.persistence.*

@Entity
@Table(name = "seller")
data class Seller(
        @Id
        @Column(name = "id_seller")
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        val idSeller: Int,
        @Column(name = "name")
        val name: String,
        @Column(name = "phone")
        val phone: String,
        @ManyToOne
        @JoinColumn(name = "id_location")
        val location: Location,
        @ManyToOne
        @JoinColumn(name = "login")
        val userPrincipal: UserPrincipal,
        @OneToOne
        @JoinColumn(name = "id_image")
        val image: Image? = null
)
