package quick.keys.controllers;

import java.util.List;
import quick.keys.entities.User;
import quick.keys.security.CurrentUserFinder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import quick.keys.services.UserService;

@Controller @RequestMapping(value = "/admin")
public class AdminController {

    final UserService usService;

    final CurrentUserFinder currentUserFinder;

    public AdminController(UserService usService, CurrentUserFinder currentUserFinder) {
        this.usService = usService;
        this.currentUserFinder = currentUserFinder;
    }

    @GetMapping
    public String adminHome(Model model) {
        User currentUser = currentUserFinder.getCurrentUser();
        model.addAttribute("currentUser", currentUser);
        return "admin/admin-home.html";
    }

    @GetMapping(value = "/manageaccounts")
    public String manageAuthorities(@RequestParam(required = false) String firstName,
                                    @RequestParam(required = false) String lastName,
                                    Model model) {
        List<User> users = usService.userSearcher(firstName, lastName);

        model.addAttribute("users", users);
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        return "admin/admin-manage-accounts.html";
    }

    @GetMapping(value = "/manageaccount")
    public String manageAccount(@RequestParam Long userId,
                                Model model) {

        User user = usService.findById(userId);
        model.addAttribute("user", user);
        return "admin/admin-manage-account.html";
    }

    @PutMapping(value = "/confirmaccountsettings")
    public String confirmAccountChanges(@RequestParam boolean accStatus,
                                        @RequestParam String role,
                                        @RequestParam Long userId,
                                        Model model) {
        model.addAttribute("role", role);
        model.addAttribute("accStatus", accStatus);
        model.addAttribute("user", usService.findById(userId));
        return "admin/admin-confirm-account-settings.html";
    }

    @PutMapping(value = "/saveaccountsettings")
    public String saveAccountSettings(@RequestParam boolean accStatus,
                                      @RequestParam String role,
                                      @RequestParam Long userId) {
        User user = usService.findById(userId);
        user.setRole(role);
        user.setEnabled(accStatus);
        usService.save(user);
        return "redirect:/admin/accountsettingssaved";
    }

    @GetMapping(value = "/accountsettingssaved")
    public String accountSettingsSaved() {
        return "admin/admin-account-settings-saved.html";
    }
}
