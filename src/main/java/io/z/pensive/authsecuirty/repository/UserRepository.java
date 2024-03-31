package io.z.pensive.authsecuirty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.z.pensive.authsecuirty.entity.*;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
