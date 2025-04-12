![CodeRabbit Pull Request Reviews](https://img.shields.io/coderabbit/prs/github/cheikh-kebe/GoneGourmet?utm_source=oss&utm_medium=github&utm_campaign=cheikh-kebe%2FGoneGourmet&labelColor=171717&color=FF570A&link=https%3A%2F%2Fcoderabbit.ai&label=CodeRabbit+Reviews)

# GoneGourmet - Application Full Stack

## Description

GoneGourmet est une application de gestion de recettes avec un backend développé en Spring Boot et un frontend en React. Cette application permet aux utilisateurs de créer, consulter, modifier et supprimer des recettes culinaires.

## Plan d'implémentation

### 1. Structure initiale du projet [✓]

- [x] Création des dossiers backend et frontend
- [x] Initialisation du projet Spring Boot
- [x] Initialisation du projet React avec Vite
- [x] Configuration des dépendances de base

### 2. Backend (Spring Boot) [ ]

- [ ] Configuration du projet Spring Boot avec les dépendances nécessaires
  - Spring Web
  - Spring Data JPA
  - MySQL Driver
  - Spring Security
- [ ] Configuration de la base de données
- [ ] Mise en place de la structure MVC
- [ ] Création des premiers endpoints REST
- [ ] Configuration de la sécurité

### 3. Frontend (React) [ ]

- [ ] Configuration du projet React
- [ ] Installation des dépendances (axios, react-router, etc.)
- [ ] Mise en place de la structure des composants
- [ ] Configuration du système de routage
- [ ] Mise en place du state management

### 4. Intégration Frontend/Backend [ ]

- [ ] Configuration CORS
- [ ] Mise en place des appels API
- [ ] Tests d'intégration

### 5. Fonctionnalités [ ]

- [ ] Implémentation du CRUD pour les recettes
- [ ] Système d'authentification des utilisateurs
- [ ] Validation des données
- [ ] Tests unitaires
- [ ] Fonctionnalités de recherche et filtrage des recettes
- [ ] Gestion des catégories de recettes

### 6. Finalisation [ ]

- [ ] Configuration des environnements (dev/prod)
- [ ] Documentation
- [ ] Déploiement sur un serveur

## Technologies utilisées

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security
- MySQL

### Frontend
- React
- TypeScript
- Vite
- Axios
- React Router

## Comment lancer le projet

### Prérequis
- Java JDK 17 ou supérieur
- Node.js et npm
- MySQL

### Backend

```bash
cd backend
./mvnw spring-boot:run