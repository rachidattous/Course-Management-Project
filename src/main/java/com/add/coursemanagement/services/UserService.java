package com.add.coursemanagement.services;

import lombok.AllArgsConstructor;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.representations.AccessToken;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class UserService {

  private final KeycloakSecurityContext keycloakSecurityContext;

  public AccessToken getAccessToken() {

    return keycloakSecurityContext.getToken();

  }

  public Set<String> getRoles() {

    return getAccessToken().getRealmAccess().getRoles();

  }

}
