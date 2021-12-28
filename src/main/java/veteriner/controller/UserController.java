package veteriner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import veteriner.entities.concretes.Owners;
import veteriner.repositories.OwnerRepo;

import java.util.List;

@Controller//Spring Thymleaf ile RestController kullanılmıyor.
@RequestMapping(path = "/veteriner")
public class UserController {

    @Autowired
    private OwnerRepo ownerRepo;


    @GetMapping("/user_register")
    public String showForm(Model model) {
        Owners owners = new Owners();
        model.addAttribute("owners", owners);
        return "user_register_form";
    }

    @GetMapping("/user_find")
    public List<String> findUser() {
        ownerRepo.addanimal();
        List<String>userinfo = ownerRepo.findUser("55858659149");

        return  userinfo;

    }

    @PostMapping("/user_register")
    public String submitForm(@ModelAttribute("owners") Owners owners)
    {
        System.out.println(owners);
        ownerRepo.save(owners);
        return "user_register_success";

    }


}
