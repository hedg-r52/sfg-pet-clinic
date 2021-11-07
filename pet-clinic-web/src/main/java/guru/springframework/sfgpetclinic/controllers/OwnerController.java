package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Andrei Soloviev (hedg.r52@gmail.com).
 * date: 07.11.2021
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"/", "/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }

}
