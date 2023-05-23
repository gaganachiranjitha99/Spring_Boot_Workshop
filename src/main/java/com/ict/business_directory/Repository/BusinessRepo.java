package com.ict.business_directory.Repository;

import com.ict.business_directory.Controller.BusinessApi;
import com.ict.business_directory.Entity.BusinessEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BusinessRepo extends JpaRepository<BusinessEntity, Long> {

}
