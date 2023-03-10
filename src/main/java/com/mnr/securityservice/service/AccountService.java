package com.mnr.securityservice.service;

import com.mnr.securityservice.entities.AppRole;
import com.mnr.securityservice.entities.AppUser;

public interface AccountService {

    public AppUser saveUser(String username, String password, String confirmedPassword );
    public AppRole save(AppRole role);
    public AppUser loadUserByUsername(String username);
    public void addRoleToUser(String username, String rolename);
}
