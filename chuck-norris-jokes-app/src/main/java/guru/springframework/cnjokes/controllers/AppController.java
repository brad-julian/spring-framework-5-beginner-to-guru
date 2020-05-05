package guru.springframework.cnjokes.controllers;

import guru.springframework.cnjokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", ""})
public class AppController {

  private final JokeService jokeService;

  public AppController(JokeService jokeService) {
    this.jokeService = jokeService;
  }

  @GetMapping
  public String showJoke(Model model) {
    model.addAttribute("joke", jokeService.getJoke());

    return "joke";
  }
}
