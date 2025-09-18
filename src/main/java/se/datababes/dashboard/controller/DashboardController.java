package se.datababes.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import se.datababes.dashboard.dto.Joke;
import se.datababes.dashboard.service.JokeService;

@Controller
public class DashboardController {

    private final JokeService jokeService;

    public DashboardController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public String dashboard(Model model) {
        Joke joke = jokeService.getJoke();
        model.addAttribute("joke", joke.joke());
        return "dashboard";
    }
}
