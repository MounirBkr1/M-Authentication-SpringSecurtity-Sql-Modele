package com.mnr.securityservice.dao;

import com.mnr.securityservice.entities.AppRole;
import com.mnr.securityservice.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
        public AppRole findByRoleName(String roleName);
}
