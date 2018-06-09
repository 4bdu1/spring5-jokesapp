package a4bdul.springframework.springbootjokesapp.controllers;

import a4bdul.springframework.springbootjokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 4bdul on 09/06/2018 at 3:56 PM.
 */
@Controller
public class JokesController {

    private JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());

        return "chucknorris";
    }
}
