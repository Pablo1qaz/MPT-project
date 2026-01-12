package org.mpt.webapp.controllers;


import org.mpt.webapp.models.company.Company;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.mpt.webapp.models.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.mpt.webapp.controllers.CompanyController;
import org.mpt.webapp.repositories.company.CompanyRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping({"/"})
    public String home() {
        return "home";
    }

    @GetMapping({"/planner"})
    public String planner() {
        return "planner";
    }

    @GetMapping({"/tasks"})
    public String tasks() {
        return "tasks";
    }

    @GetMapping({"/guests"})
    public String guests() {
        return "guests";
    }

    @GetMapping({"/tables"})
    public String tables() {
        return "tables";
    }

    @GetMapping({"/forum"})
    public String forum() { return "forum"; }

    @GetMapping({"/contact"})
    public String contact(Model model) {
        // 1. Tworzymy listę osób
        List<Person> team = new ArrayList<>();

        // 2. Dodajemy konkretne osoby (Imie, Stanowisko, Telefon, Email)
        team.add(new Person("Paweł Oleszczak", "Developer", "601234567", "pawel.oleszczak@example.com"));
        team.add(new Person("Gabriel Kraj", "Developer", "502987654", "g.kraj@firma.pl"));
        team.add(new Person("Zuzanna Szuba", "Scrum Master", "789012345", "zuza.szub@tech.com"));
        team.add(new Person("Konrad Maciejewski", "Product Owner", "690111222", "k.maciej@dev.io"));
        team.add(new Person("Sebastian Gawlak", "Developer", "511333444", "seba.gwl@agile.pl"));
        team.add(new Person("Kacper Janicki", "Developer", "888555222", "kacpi.jck@device.io"));
        team.add(new Person("Jan Wojdat", "Developer", "721444999", "jan.w@design.net"));
        // Możesz dodać więcej osób tutaj...

        // 3. Przekazujemy listę do pliku HTML pod nazwą "people"
        model.addAttribute("people", team);

        return "contact";
    }






}