package com.ict.business_directory.Controller;

import com.ict.business_directory.Entity.Address;
import com.ict.business_directory.Entity.BusinessEntity;
import com.ict.business_directory.Entity.Location;
import com.ict.business_directory.Repository.BusinessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api")
public class BusinessApi {

    @Autowired
    private BusinessRepo repo;

   @GetMapping("/showbusiness")
   public ResponseEntity<BusinessEntity> show_buisiness(){

       BusinessEntity b = new BusinessEntity();
       b.setName("treinetic");
       b.setPhone("+0770298538");

       Address a =new Address();
       a.setLine_one("temple road");
       a.setLine_two("colombo 10");
       a.setState("western");
       a.setCity("maradana");
       a.setCountry("Sri lanka");

       b.setAddress(a);

       Location l=new Location();
       l.setLat("1.99383");
       l.setLon("2.46638");

       b.setLocation(l);
       return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(b);

   }

   @PostMapping("/business")
    public ResponseEntity<BusinessEntity> saveBusiness(@RequestBody BusinessEntity b){
        b=this.repo.save(b);

       return ResponseEntity.ok().body(b);

   }

   @GetMapping("/business")
   public ResponseEntity<List<BusinessEntity>>saveBusiness(){

       List<BusinessEntity> all=repo.findAll();
       return  ResponseEntity.ok().body(all);


   }


   @GetMapping("/business/{id}")
    public ResponseEntity<List<BusinessEntity>>saveIdBusiness(@PathVariable Long id){

       Optional<BusinessEntity> b= this.repo.findById(id);
       return ResponseEntity.ok().body();


   }

   @DeleteMapping("/business/{id}")
    public ResponseEntity deleteBusiness(@PathVariable Long id){

       if(this.repo.existsById(id)){
           this.repo.deleteById(id);
           return ResponseEntity.ok().build();
       }
       return ResponseEntity.status(400).build();
   }

   @GetMapping("/my_url")
    public ResponseEntity<String> getmyUrl(){

     //  return ResponseEntity.ok().body(this.urlconfig.getUrl());
   }


}
