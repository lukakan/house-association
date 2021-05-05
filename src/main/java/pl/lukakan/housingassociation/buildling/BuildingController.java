package pl.lukakan.housingassociation.buildling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.lukakan.housingassociation.administration.Administration;
import pl.lukakan.housingassociation.administration.AdministrationRepository;

import java.util.Optional;

@Controller
public class BuildingController {

    private final AdministrationRepository administrationRepository;
    private final BuildingRepository buildingRepository;

    @Autowired
    public BuildingController(AdministrationRepository administrationRepository, BuildingRepository buildingRepository) {
        this.administrationRepository = administrationRepository;
        this.buildingRepository = buildingRepository;
    }


    @GetMapping("/administration/{id}/building/add")
    public String addBuildingForm(@PathVariable Long id, Model model) {
        model.addAttribute("building", new Building());
        model.addAttribute("administration_id", id);
        model.addAttribute("editMode", false);
        model.addAttribute("action", "add");

        return "addBuilding";
    }

    @PostMapping("/administration/{id}/building/add")
    public String addBuilding(@PathVariable Long id, Building building) {
        Optional<Administration> administration = administrationRepository.findById(id);
        administration.ifPresent(building::setAdministration);
        buildingRepository.save(building);
        return "redirect:/";
    }

    @GetMapping("/administration/building/{id}/remove")
    public String removeBuilding(@PathVariable Long id) {
        Optional<Building> building = buildingRepository.findById(id);
        if (building.isPresent()) {
            Long administrationId = building.get().getAdministration().getId();
            buildingRepository.delete(building.get());
            String redirect = "redirect:/administration/" + administrationId;
            return redirect;
        }
        return "home";
    }

}
