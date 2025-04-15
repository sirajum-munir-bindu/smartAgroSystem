package com.SmartAgroSystm.AcademicProject.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller; // Update to Controller
import org.springframework.web.bind.annotation.*;
import com.SmartAgroSystm.AcademicProject.model.User;
import com.SmartAgroSystm.AcademicProject.service.UserService;



import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Controller // Change to Controller
public class LoginController {

    @Autowired
    private UserService userService;

    // Serve the login page
    @GetMapping("/login")
    public String showLoginPage(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return "redirect:/dashboard"; // Redirect to dashboard if session is active
        }
        return "login"; // Return the name of the login.html view
    }

    // Login endpoint
    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> loginData, HttpSession session) {
        String email = loginData.get("email");
        String password = loginData.get("password");

        Map<String, String> response = new HashMap<>();

        if (email == null || password == null) {
            response.put("status", "failure");
            response.put("message", "Email and password must be provided");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        Optional<User> user = userService.login(email, password);

        if (user.isPresent()) {
            session.setAttribute("user", user.get());
            response.put("status", "success");
            response.put("message", "Login successful");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.put("status", "failure");
            response.put("message", "Invalid email or password");
            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
        }
    }

    // Logout endpoint
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:login"; // Redirect to login page after logout
    }

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session){
        return "dashboard";
    }

    @GetMapping("/cart")
    public String cart(HttpSession session){
        return "cart";
    }

    @GetMapping("/cart_jamal")
    public String cart_jamal(HttpSession session){
        return "cart_jamal";
    }
}