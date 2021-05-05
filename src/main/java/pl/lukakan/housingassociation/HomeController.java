package pl.lukakan.housingassociation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.lukakan.housingassociation.administration.Administration;
import pl.lukakan.housingassociation.administration.AdministrationRepository;

import java.util.List;

@Controller
public class HomeController {

    private final AdministrationRepository administrationRepository;

    @Autowired
    public HomeController(AdministrationRepository administrationRepository) {
        this.administrationRepository = administrationRepository;
    }

    @GetMapping("/")
    public String homePage(Model model) {
        List<Administration> administrations = administrationRepository.findAll();
        model.addAttribute("administrations", administrations);

        return "home";

    }
}
