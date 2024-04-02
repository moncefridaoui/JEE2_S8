package com.example.patient1_app.repositories;

import com.example.patient1_app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
   public List<Patient> findByMalade(boolean m);
  // @Query("select p from Patient p where p.name like :x")
   //List<Patient> chercherPatients(@Param("x") String name);

}
