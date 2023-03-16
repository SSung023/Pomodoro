package Pomodoro.project.domain.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@RequiredArgsConstructor
public class Home {

    @Id @GeneratedValue
    private Long id;

    private String name;


    public Home(String name) {
        this.name = name;
    }
}
