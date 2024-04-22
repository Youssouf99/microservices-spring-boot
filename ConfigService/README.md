# Service de Configuration (Config Service)

Ce service agit comme un serveur de configuration centralisé pour l'ensemble des microservices dans l'écosystème d'application. Il utilise Spring Cloud Config pour stocker et fournir des configurations externes aux microservices, ce qui permet une gestion centralisée et dynamique des configurations.

## Fonctionnalités

- Stockage centralisé des configurations dans un référentiel de configuration (Git, SVN, etc.).
- Fourniture dynamique des configurations aux microservices en fonction de leur profil et de leur environnement.
- Possibilité de recharger les configurations sans redémarrer les microservices.

## Configuration

La configuration du service de configuration se fait principalement via le fichier `application.yml` situé dans le répertoire `src/main/resources`. Voici un exemple de configuration de base :

```yaml
spring:
  application:
    name: config-service

# Configuration de Spring Cloud Config
spring.cloud.config.server:
  git:
    uri: https://github.com/votre-repo/config-repo.git
    username: votre-username
    password: votre-password
    search-paths: config
    default-label: main
```

Dans cet exemple de configuration :

- `config-service` est le nom de l'application.
- Le service est configuré pour utiliser Git comme référentiel de configuration, avec l'URL du dépôt, le nom d'utilisateur et le mot de passe spécifiés.
- Le chemin de recherche est configuré pour rechercher les configurations dans le répertoire `config`.
- Le label par défaut est défini sur `main`.

## Exécution

Pour exécuter le service de configuration, assurez-vous que les dépendances sont correctement configurées dans le fichier `pom.xml` et que toutes les propriétés nécessaires sont définies dans le fichier `application.yml`. Ensuite, vous pouvez démarrer l'application à l'aide de votre IDE ou en exécutant la commande Maven suivante :

```
mvn spring-boot:run
```

Assurez-vous que le service de configuration est accessible pour les microservices qui souhaitent récupérer leurs configurations à partir de ce service.



