package com.ict.business_directory.Controller;

import com.ict.business_directory.Entity.Address;
import com.ict.business_directory.Entity.BusinessEntity;
import com.ict.business_directory.Entity.Location;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {


    @GetMapping("/showBusiness")
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

}
