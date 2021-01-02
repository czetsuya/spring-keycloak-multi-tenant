[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

**Help me build more open-source projects by becoming my sponsor.*

# Spring Keycloak Multi Tenant Project

This project demonstrates multi-tenancy in Keycloak by overriding the class KeycloakConfigResolver to load the keycloak json configuration file depending on the realm specified in the path in each request. The realm is information is cache, so it's only loaded once per login.

It uses a single Keycloak instance with multiple realms.

## Prerequisites

- You must have prior knowledge with Spring and Keycloak.
- You must have a project created in your Google console for testing.

## Instructions

1. Create 2 projects in Google Console. Create credentials and Oauth screens for both.
2. Import the realms inside the the keycloak-realms directory.
3. Configure the Identity Provider inside Keycloak (Google).
4. Set the idpHint (default identity provider for a realm) in Authentication / Identity Provider Redirector, click Actions / Config and set Alias=idpHint, Default Identity Provider=Google.

## References

- https://www.czetsuyatech.com/2020/11/how-to-implement-multitenancy-with-spring-boot-and-keycloak.html
- https://www.keycloak.org/docs/latest/securing_apps/index.html
- https://www.keycloak.org/docs/latest/securing_apps/index.html#_multi_tenancy
