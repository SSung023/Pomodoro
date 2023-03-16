package Pomodoro.project.controller;


import Pomodoro.project.domain.dto.Home;
import Pomodoro.project.repository.HomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class HomeController {
    private final HomeRepository repository;

    @GetMapping("/home")
    public String getHome(){
        Home home = new Home("test");
        repository.save(home);
        return "Hello World!";
    }

    @GetMapping("/")
    public String test(){
        Home home = new Home("test");
        repository.save(home);
        return "Hello World!!!!";
    }
}
