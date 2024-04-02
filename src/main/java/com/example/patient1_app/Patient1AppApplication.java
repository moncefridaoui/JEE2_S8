package com.example.patient1_app;

import com.example.patient1_app.entities.Patient;
import com.example.patient1_app.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Patient1AppApplication implements CommandLineRunner {
    @Autowired
    PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(Patient1AppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for(int i=0;i<50;i++){
            Patient p = new Patient(null,"none",new Date(),(Math.random()>0.5?true:false),20);
            patientRepository.save(p);
        }

        List<Patient> l = patientRepository.findAll();
        for(Patient p : l){
            System.out.println(p);
        }

        /*List<Patient> l = patientRepository.findByMalade(true);
        for(Patient p : l){
            System.out.println(p);
        }*/

        /*Patient p = patientRepository.findById(4L).orElse(null);
        p.setName("none1");
        patientRepository.save(p);*/

        /*patientRepository.deleteById(4L);*/

       /*List<Patient> l = patientRepository.chercherPatients("none1");
        for (Patient p : l){
            System.out.println(p);
        }*/



    }
}
