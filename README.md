# Projet Ecosystème de Microservices

Ce projet est un exemple d'architecture basée sur des microservices utilisant Spring Cloud. Il comprend plusieurs services indépendants qui travaillent ensemble pour fournir une application distribuée.

## Structure du Projet

L'écosystème de microservices se compose des services suivants :

1. **Service de Passerelle (Gateway Service)** : Un service qui agit comme une passerelle d'entrée pour toutes les requêtes externes et route le trafic vers les microservices appropriés.
2. **Service de Découverte (Discovery Service)** : Un service qui sert de registre de service pour enregistrer et découvrir dynamiquement les instances de microservices dans l'architecture.
3. **Service de Configuration (Config Service)** : Un service qui fournit une source centralisée de configuration pour tous les microservices en utilisant Spring Cloud Config Server.
4. **App1Service** : Un microservice qui fournit des fonctionnalités spécifiques liées à l'application 1.
5. **App2Service** : Un microservice qui fournit des fonctionnalités spécifiques liées à l'application 2.
6. **App3Service** : Un microservice qui fournit des fonctionnalités spécifiques liées à l'application 3.

## Technologies Utilisées

- **Spring Boot** : Framework Java pour le développement d'applications basées sur Spring.
- **Spring Cloud** : Suite de projets pour la construction de systèmes distribués basés sur Spring.
- **Spring Cloud Netflix Eureka** : Composant pour la découverte de services.
- **Spring Cloud Config Server** : Composant pour la gestion centralisée de la configuration.
- **Spring Cloud Gateway** : Composant pour la création d'une passerelle d'API.
- **Git** : Système de contrôle de version utilisé pour stocker les fichiers de configuration.
- **Java** : Langage de programmation utilisé pour le développement des services.
- **Maven** : Outil de gestion de projet pour la construction et la gestion des dépendances.
- **GitHub** : Plateforme de développement collaboratif utilisée pour héberger le code source et les fichiers de configuration.

## Configuration

Chaque service utilise un fichier `application.yml` ou `application.properties` pour sa configuration. Assurez-vous de personnaliser les fichiers de configuration en fonction de vos besoins spécifiques.

## Exécution

Pour exécuter l'écosystème de microservices, assurez-vous que tous les services sont correctement configurés et que toutes les dépendances sont résolues. Ensuite, vous pouvez démarrer chaque service séparément à l'aide de Maven ou de votre IDE préféré. Assurez-vous de démarrer le service de découverte avant tout autre service qui s'enregistre auprès de lui.
