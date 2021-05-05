package pl.lukakan.housingassociation.administration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.lukakan.housingassociation.buildling.Building;

import java.util.Optional;

@Controller
public class AdministrationController {

    private final AdministrationRepository administrationRepository;

    @Autowired
    public AdministrationController(AdministrationRepository administrationRepository) {
        this.administrationRepository = administrationRepository;
    }

    @GetMapping("/administration/{id}")
    public String homePage(@PathVariable Long id, Model model) {
        Optional<Administration> administration = administrationRepository.findById(id);
        if (administration.isPresent()) {
            model.addAttribute("administration", administration.get());
            return "administration";
        } else {
            return "error";
        }
    }

}
