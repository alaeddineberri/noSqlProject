-- Insérer des cours
INSERT INTO courses (title, teacher, summary, level, available_places) VALUES
('Mathématiques', 'Professeur A', 'Ce cours porte sur les concepts de base des mathématiques.', 'débutant', 20),
('Physique', 'Professeur B', 'Ce cours couvre les principes fondamentaux de la physique.', 'intermédiaire', 15),
('Informatique', 'Professeur C', 'Ce cours aborde les bases de la programmation.', 'avancé', 10);

-- Insérer des étudiants
INSERT INTO students (name, course_id) VALUES
('Étudiant 1', 1), -- Étudiant 1 est inscrit au cours de Mathématiques
('Étudiant 2', 2), -- Étudiant 2 est inscrit au cours de Physique
('Étudiant 3', 3), -- Étudiant 3 est inscrit au cours d'Informatique
('Étudiant 4', 1), -- Étudiant 4 est inscrit au cours de Mathématiques
('Étudiant 5', 2); -- Étudiant 5 est inscrit au cours de Physique

-- Insérer des professeurs
INSERT INTO teachers (name, course_id) VALUES
('Professeur A', 1), -- Professeur A enseigne le cours de Mathématiques
('Professeur B', 2), -- Professeur B enseigne le cours de Physique
('Professeur C', 3); -- Professeur C enseigne le cours d'Informatique
