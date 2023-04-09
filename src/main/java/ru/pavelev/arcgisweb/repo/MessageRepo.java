package ru.pavelev.arcgisweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pavelev.arcgisweb.domain.Message;

public interface MessageRepo extends JpaRepository<Message,Long> {
}
