package sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sfpetclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {

  OwnerService ownerService;

  public OwnerController(OwnerService ownerService) {
    this.ownerService = ownerService;
  }

  @RequestMapping({"","/","index", "index.html"})
  public String showOwners(Model model){

    model.addAttribute("owners", ownerService.findAll());
    return "owners/index";
  }

}
