# Service Produit (Product Service)

Ce service gère les informations sur les produits dans l'écosystème de l'application. Il expose des API pour créer, lire, mettre à jour et supprimer des produits, ainsi que pour récupérer des détails sur un produit spécifique.

## Fonctionnalités

- Gestion CRUD (Create, Read, Update, Delete) des produits.
- Stockage des informations sur les produits dans une base de données.
- Exposition d'API RESTful pour interagir avec les produits.

## Technologies Utilisées

- **Spring Boot**: Framework Java pour la création de microservices.
- **Spring Data JPA**: Facilite l'interaction avec la base de données à l'aide de l'ORM (Object-Relational Mapping).
- **Hibernate**: Framework ORM pour la persistance des données.
- **H2 Database**: Base de données en mémoire pour le développement et les tests.
- **Spring Boot Actuator**: Fournit des fonctionnalités de surveillance et de gestion de l'application.
- **Spring Boot DevTools**: Outils de développement pour un cycle de développement rapide.
- **Spring Cloud Config**: Gestion centralisée des configurations.
- **Spring Cloud Netflix Eureka**: Service de découverte pour la gestion des services.

## Configuration

La configuration du service produit se fait principalement via le fichier `application.yml` situé dans le répertoire `src/main/resources`. Voici un exemple de configuration de base :

```yaml
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    driver-class-name: org.h2.Driver
    username: sa
    password:
  jpa:
    hibernate:
      ddl-auto: update
```

Dans cet exemple de configuration :

- `testdb` est le nom de la base de données H2 utilisée pour stocker les informations sur les produits.
- L'utilisateur par défaut est `sa` sans mot de passe.

## Exécution

Pour exécuter le service produit, assurez-vous que les dépendances sont correctement configurées dans le fichier `pom.xml` et que toutes les propriétés nécessaires sont définies dans le fichier `application.yml`. Ensuite, vous pouvez démarrer l'application à l'aide de votre IDE ou en exécutant la commande Maven suivante :

```
mvn spring-boot:run
```

Assurez-vous que le service produit est en cours d'exécution et accessible pour les autres services de l'application.
