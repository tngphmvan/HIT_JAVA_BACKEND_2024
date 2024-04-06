package com.example.homeworkweek3.Controller;

import com.example.homeworkweek3.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller

public class UserController {
    private List<User> users = new ArrayList<>(List.of(new User("Hola", "Pepsi"),
            new User("NamDi", "BayHai")));
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        users.add(new User(username, password));
//        System.out.println(user);
        return "redirect:/content";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                model.addAttribute("user", user);
                return "redirect:/content";
            }
        }
        model.addAttribute("error", "Invalid username or password");
        return "login";
    }

    @GetMapping("/content")
    public String showContent(Model model) {
        model.addAttribute("users", users);
        return "content";
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok().body(users);
    }

    public List<User> getUsers() {
        return users;
    }
}
