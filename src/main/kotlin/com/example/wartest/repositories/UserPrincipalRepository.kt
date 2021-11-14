package com.example.wartest.repositories

import com.example.wartest.entity.UserPrincipal
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserPrincipalRepository : CrudRepository<UserPrincipal, String>