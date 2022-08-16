package com.czetsuyatech.controllers;

import java.security.Principal;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.keycloak.representations.AccessToken;
import org.keycloak.representations.IDToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@RestController
public class CatalogController {

    @GetMapping("/tenant/branch1/catalog")
    public String listCatalogBranch1() {
        return getUserInfo();
    }

    @GetMapping("/tenant/branch2/catalog")
    public String listCatalogBranch2() {
        return getUserInfo();
    }

    @SuppressWarnings("unchecked")
    private String getUserInfo() {

        KeycloakAuthenticationToken authentication = (KeycloakAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();

        final Principal principal = (Principal) authentication.getPrincipal();

        String tokenInfo = null;
        if (principal instanceof KeycloakPrincipal) {

            KeycloakPrincipal<KeycloakSecurityContext> kPrincipal = (KeycloakPrincipal<KeycloakSecurityContext>) principal;
            KeycloakSecurityContext ksc = kPrincipal.getKeycloakSecurityContext();
            IDToken token = ksc.getIdToken();
            AccessToken accessToken = kPrincipal.getKeycloakSecurityContext().getToken();
            tokenInfo = accessToken.getSubject();

            // this value is the one use to call another service as bearer token
            // Authorization : Bearer kcs.getTokenString()
            // use this link to read the token https://jwt.io
            System.out.println(ksc.getTokenString());
            System.out.println(accessToken.getGivenName());
            System.out.println(accessToken.getFamilyName());
        }

        return "userInfo " + tokenInfo;
    }
}
