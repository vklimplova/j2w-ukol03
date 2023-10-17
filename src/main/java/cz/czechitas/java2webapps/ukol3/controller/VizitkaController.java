package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

  private final List<Vizitka> seznamVizitek = List.of(
         new Vizitka("Tomáš Kusý","SK Joudrs Praha","Dolákova 1","Praha, 181 00","kusy@joudrs.cz","+420 123 345 789","joudrs.cz"),
          new Vizitka("Karolína Dvořáková","Kačenky","Jiřího z Poděbrad 12","České Budějovice, 123 00", null, null, "kacka.cz"),
          new Vizitka("Veronika Klimplová","Inservis","Lodžská 17","Praha, 181 00", "veruklimpl@seznam.cz","+420 987 654 321", null)
  );

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView result = new ModelAndView("/seznam");
    result.addObject("vizitka", seznamVizitek);
    return result;
  }

  @GetMapping("/detail/{id}")
    public ModelAndView detail (@PathVariable int id) {
    ModelAndView detaily = new ModelAndView("/detail");
    detaily.addObject("detail", seznamVizitek.get(id));
    return detaily;
  }

}
