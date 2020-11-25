[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

**Help me build more open-source projects by becoming my sponsor.*

# Spring Keycloak Multi Tenant Project

This project demonstrates multi-tenancy in Keycloak by overriding the class KeycloakConfigResolver to load the keycloak json configuration file depending on the realm specified in the path in each request. The realm is information is cache, so it's only loaded once per login.

It uses a single Keycloak instance with multiple realms.

## Prerequisites

- You must have prior knowledge with Spring and Keycloak.
- You must have a project created in your Google console for testing.
- Don't forget to configure the Identity Provider inside Keycloak after importing the realms inside the the keycloak-realms directory.

## References

- https://www.keycloak.org/docs/latest/securing_apps/index.html
- https://www.keycloak.org/docs/latest/securing_apps/index.html#_multi_tenancy