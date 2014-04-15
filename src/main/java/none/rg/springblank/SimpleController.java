package none.rg.springblank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {

    @RequestMapping({"/", "/index"})
    public String general() {
        return "index";
    }

}
