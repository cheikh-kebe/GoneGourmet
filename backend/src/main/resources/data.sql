-- Insertion des utilisateurs de test
INSERT INTO users (username, email, password) VALUES
('admin', 'admin@gonegourmet.com', '$2a$10$dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HZWzG3YB1tlRy.fqvM/BG');

INSERT INTO users (username, email, password) VALUES
('user1', 'user1@gonegourmet.com', '$2a$10$dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HZWzG3YB1tlRy.fqvM/BG');

-- Note: Les mots de passe sont hashés, ici c'est 'password' pour tous les utilisateurs
-- Nous ajouterons plus de tables (recettes, ingrédients, etc.) plus tard