package com.ict.business_directory.Controller;

import com.ict.business_directory.Entity.BusinessEntity;
import com.ict.business_directory.Repository.BusinessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {


        @Autowired
        private BusinessRepo repo;


    @GetMapping("/business")
    public String showbusinesspage(Model model){
        List<BusinessEntity> all=this.repo.findAll();
        model.addAttribute
        return"all_businesses";



    }
}
