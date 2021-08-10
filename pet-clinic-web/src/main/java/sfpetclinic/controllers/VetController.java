package sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sfpetclinic.services.VetService;

@RequestMapping("/vets")
@Controller
public class VetController {

  VetService vetService;

  public VetController(VetService vetService) {
    this.vetService = vetService;
  }

  @RequestMapping({"","/","index","index,html"})
  public String showVets(Model model){

    model.addAttribute("vets", vetService.findAll());
    return "vets/index";
  }

}
