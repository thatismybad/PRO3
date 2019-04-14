package cz.uhk.fim.pro3.webapp.user;

import cz.uhk.fim.pro3.webapp.db.UserCrudService;
import cz.uhk.fim.pro3.webapp.model.User;
import cz.uhk.fim.pro3.webapp.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserCrudService userService;

    @Autowired
    private SecurityService securityService;

    @GetMapping("/signup")
    public String signUp(Model model) {
        model.addAttribute("userForm", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String signUp(@ModelAttribute("userForm") User user, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "signup";
        //
//        }

        userService.create(user);
        for (User r : userService.loadAll()) {
            System.out.println(r.getUsername());
        }
        securityService.autoLogin(user.getUsername(), user.getConfirmPassword());

        return "redirect:/welcome";
    }

    @GetMapping("/login")
    public String login() {
        return "signin";
    }

    @GetMapping({"/", "/welcome"})
    public String welcome() {
        return "welcome";
    }
}
