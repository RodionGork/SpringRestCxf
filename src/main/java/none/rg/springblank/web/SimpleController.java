package none.rg.springblank.web;

import none.rg.springblank.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {

    @Autowired
    private Dao dao;

    @RequestMapping({"/", "/index"})
    public String general() {
        return "index";
    }

    @RequestMapping("/addgroup")
    public String addGroup(Model model,
            @RequestParam("name") String name) {
        dao.addGroup(name);
        return "redirect:/";
    }

    @RequestMapping("/addprod")
    public String addProd(Model model,
            @RequestParam("name") String name, @RequestParam(value = "group", required = true) int group) {
        dao.addProduct(name,group);
        return "redirect:/";
    }
}
