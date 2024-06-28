package com.example.FinancialRecords.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FinancialRecordController {

    @GetMapping("/")
    public String showHomePage() {
        return "index"; // This will resolve to src/main/resources/templates/index.html
    }

    @GetMapping("/about")
    public String showAboutPage() {
        return "about"; // This will resolve to src/main/resources/templates/about.html
    }

    @GetMapping("/contact")
    public String showContactPage() {
        return "contact"; // This will resolve to src/main/resources/templates/contact.html
    }
}