package org.mpt.webapp.repositories;

import org.mpt.webapp.models.NewUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewUsersRepository extends JpaRepository<NewUsers, Integer> {

    public NewUsers findByEmail(String email);
}