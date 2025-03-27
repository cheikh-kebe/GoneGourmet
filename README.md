# GoneGourmet

Application de gestion de recettes de cuisine.

## Structure du Projet

- `backend/` : API Spring Boot
- `frontend/` : Application React/TypeScript avec Vite

## Étapes Réalisées

1. Configuration Initiale ✓

   - Création de la structure du projet
   - Configuration Git et GitHub
   - Mise en place des fichiers .gitignore

2. Configuration Backend ✓

   - Configuration des variables d'environnement
   - Structure MVC (Models, Views, Controllers)
   - Configuration de Spring Security de base

3. Base de Données H2 ✓
   - Migration vers H2 pour le développement ✓
   - Configuration de la base de données en mémoire ✓
   - Mise en place des scripts SQL d'initialisation ✓
     - schema.sql pour la structure
     - data.sql pour les données de test
   - Configuration de la console H2 ✓
   - Implémentation de l'entité User avec timestamps ✓

## Configuration H2 ✓

### Accès à la Console H2

- URL : http://localhost:8080/h2-console
- JDBC URL : jdbc:h2:mem:gonegourmetdb
- Utilisateur : sa
- Mot de passe : (vide)

### Structure de la Base de Données

- Table `users` :
  - id (BIGINT, Auto-increment)
  - username (VARCHAR, Unique)
  - email (VARCHAR, Unique)
  - password (VARCHAR)
  - created_at (TIMESTAMP)
  - updated_at (TIMESTAMP)

## Prochaines Étapes

1. Connection Frontend-Backend [ ]

   - Configuration CORS
   - Mise en place des services API
   - Tests de connexion

2. Implémentation des Fonctionnalités [ ]
   - Authentification avec JWT
   - CRUD des recettes
   - Gestion des ingrédients

## Commandes Utiles

### Backend

```bash
# Lancer le backend
mvn spring-boot:run
```

### Frontend

```bash
# Installation des dépendances
npm install

# Lancer le frontend en développement
npm run dev
```

## Variables d'Environnement

### Backend (.env)

- Profil actif : dev
- Configuration H2 dans application-dev.properties

### Frontend (.env)

- VITE_API_URL=http://localhost:8080/api
