package Pomodoro.project.repository;

import Pomodoro.project.domain.dto.Home;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Home, Long> {
}
