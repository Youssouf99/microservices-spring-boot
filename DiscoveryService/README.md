
# Service de Découverte (Discovery Service)

Ce service agit comme un registre de service pour l'ensemble de l'écosystème d'application. Il utilise Spring Cloud Netflix Eureka pour permettre l'enregistrement et la découverte dynamique des microservices dans le système distribué.

## Fonctionnalités

- Enregistrement et surveillance des microservices dans l'architecture.
- Facilitation de la résilience et de la scalabilité à travers la découverte dynamique des services.
- Intégration transparente avec d'autres services de l'écosystème, tels que les passerelles et les clients.

## Configuration

La configuration du service de découverte se fait principalement via le fichier `application.yml` situé dans le répertoire `src/main/resources`. Voici un exemple de configuration de base :

```yaml
spring:
  application:
    name: discovery-service

# Configuration de Eureka
eureka:
  instance:
    hostname: localhost
  client:
    registerWithEureka: true
    fetchRegistry: true
    serviceUrl:
      defaultZone: http://localhost:8761/eureka/
```

Dans cet exemple de configuration :

- `discovery-service` est le nom de l'application.
- Eureka est configuré pour fonctionner en mode client et se connecter à un serveur Eureka en cours d'exécution sur `http://localhost:8761`.

## Exécution

Pour exécuter le service de découverte, assurez-vous que les dépendances sont correctement configurées dans le fichier `pom.xml` et que toutes les propriétés nécessaires sont définies dans le fichier `application.yml`. Ensuite, vous pouvez démarrer l'application à l'aide de votre IDE ou en exécutant la commande Maven suivante :

```
mvn spring-boot:run
```

Assurez-vous que le service de découverte est démarré avant tout autre service qui souhaite s'enregistrer auprès de lui.



