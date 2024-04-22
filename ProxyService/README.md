# Service de Passerelle (Gateway Service)

Ce service agit comme une passerelle (gateway) pour router les requêtes vers les différents microservices dans l'écosystème de l'application. Il utilise Spring Cloud Gateway pour la gestion des routes et peut s'intégrer à des serveurs de registre tels que Eureka pour la découverte automatique des services.

## Fonctionnalités

- Routage dynamique des requêtes vers les microservices appropriés.
- Intégration avec les serveurs de registre pour la découverte automatique des services.
- Prise en charge de la gestion des routes basée sur la configuration externe.

## Configuration

La configuration de la passerelle se fait principalement via le fichier `application.yml` situé dans le répertoire `src/main/resources`. Voici un exemple de configuration de base :

```yaml
spring:
  application:
    name: gateway-service

# Configuration de Spring Cloud Gateway
spring.cloud.gateway:
  discovery:
    locator:
      enabled: true  # Activation de la découverte de services
  routes:
    - id: users-route
      uri: lb://USERS-SERVICE
      predicates:
        - Path=/users/**
    - id: products-route
      uri: lb://PRODUCTS-SERVICE
      predicates:
        - Path=/products/**

# Configuration de Eureka
eureka:
  client:
    serviceUrl:
      defaultZone: http://localhost:8761/eureka/
```

Dans cet exemple de configuration :

- `gateway-service` est le nom de l'application.
- `USERS-SERVICE` et `PRODUCTS-SERVICE` sont les noms des services enregistrés dans Eureka.
- Les routes `/users/**` et `/products/**` sont configurées pour rediriger les requêtes vers les services correspondants.

## Exécution

Pour exécuter le service de passerelle, assurez-vous que les dépendances sont correctement configurées dans le fichier `pom.xml` et que toutes les propriétés nécessaires sont définies dans le fichier `application.yml`. Ensuite, vous pouvez démarrer l'application à l'aide de votre IDE ou en exécutant la commande Maven suivante :

```
mvn spring-boot:run
```

Assurez-vous que tous les services auxquels la passerelle fait référence sont également en cours d'exécution et correctement enregistrés dans Eureka.
