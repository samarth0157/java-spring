package com.example.javatutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JavaController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Java Basics for Students");
        model.addAttribute("intro", "Java is a high-level, object-oriented programming language that is widely used in the IT industry. It powers everything from Android apps to enterprise systems.");
        model.addAttribute("features", new String[]{
                "Object-Oriented",
                "Platform Independent",
                "Robust and Secure",
                "Rich API",
                "High Performance with JIT"
        });
        model.addAttribute("useCases", new String[]{
                "Web Development",
                "Mobile Applications (Android)",
                "Enterprise Applications",
                "Big Data",
                "Scientific Applications"
        });
        model.addAttribute("whyLearn", new String[]{
                "Java is an industry-standard programming language used by millions of developers worldwide.",
                "It provides excellent career opportunities in fields like web development, mobile development, and enterprise software.",
                "Its strong community ensures ample resources, libraries, and frameworks to accelerate development."
        });
        model.addAttribute("resources", new String[]{
                "https://docs.oracle.com/en/java/ - Official Oracle Java Documentation",
                "https://www.geeksforgeeks.org/java/ - GeeksforGeeks Java Tutorials",
                "https://www.w3schools.com/java/ - W3Schools Java Tutorials",
                "https://www.udemy.com/topic/java/ - Java Courses on Udemy"
        });
        return "index";
    }
}
