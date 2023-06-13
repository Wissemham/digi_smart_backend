package com.stage.repository;

import java.util.Optional;

import com.stage.models.ERole;
import com.stage.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
