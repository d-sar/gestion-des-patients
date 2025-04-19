# 🏥 Gestion des Patients - Application Spring Boot

## 📘 Description

Ce projet est une application de gestion de patients développée avec **Spring Boot**. Elle permet de gérer une base de données contenant les informations des patients : ajout, recherche, mise à jour et suppression.

L’application utilise **Spring Data JPA** pour interagir avec la base de données et fournit des méthodes de requête personnalisées.

---

## ⚙️ Technologies utilisées

- Java 23+
- Spring Boot 
- Spring Data JPA
- H2 / MySQL
- Maven

---

## 🔍 Fonctionnalités
- 🔍 Rechercher des patients par nom

- ➕ Ajouter un patient

- 📝 Modifier un patient

- ❌ Supprimer un patient

- 🗃️ Afficher tous les patients

## 🧪 Configuration (exemple avec H2 en mémoire)
  ```bash
        spring.application.name=patient
        server.port=8085
        spring.datasource.url = jdbc:h2:mem:patients-db
        spring.h2.console.enabled=true
