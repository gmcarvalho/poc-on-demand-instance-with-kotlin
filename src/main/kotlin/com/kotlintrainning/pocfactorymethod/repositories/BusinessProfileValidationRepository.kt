package com.kotlintrainning.pocfactorymethod.repositories

import com.kotlintrainning.pocfactorymethod.model.entities.BusinessProfileValidation
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BusinessProfileValidationRepository: JpaRepository<BusinessProfileValidation, Long>{
    fun findByBusinessProfile(businessProfile: String): BusinessProfileValidation
}