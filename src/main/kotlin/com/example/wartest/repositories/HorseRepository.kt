package com.example.wartest.repositories

import com.example.wartest.entity.Horse
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface HorseRepository : CrudRepository<Horse, Long>