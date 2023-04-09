package ru.pavelev.arcgisweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pavelev.arcgisweb.domain.User;

public interface UserDetailsRepo extends JpaRepository<User,String> {
}

