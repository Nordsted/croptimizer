package dk.nordsted.croptimizer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontpageController {

    @GetMapping({"/"})
    public String frontpageInit(Model model, @RequestParam(value = "name", required = false, defaultValue = "world") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
}
