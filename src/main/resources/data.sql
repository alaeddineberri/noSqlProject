-- Insert teachers
INSERT INTO teachers (name) VALUES
('Professor A'),
('Professor B'),
('Professor C');

-- Insert courses
INSERT INTO courses (title, summary, level, available_places, teacher_id) VALUES
('Mathematics', 'Basic concepts of mathematics', 'Beginner', 20, 1),
('Physics', 'Fundamental principles of physics', 'Intermediate', 15, 2),
('Computer Science', 'Introduction to programming', 'Advanced', 10, 3);

-- Insert students
INSERT INTO students (name, course_id) VALUES
('Student 1', 1), -- Enrolled in Mathematics
('Student 2', 1), -- Enrolled in Mathematics
('Student 3', 2), -- Enrolled in Physics
('Student 4', 2), -- Enrolled in Physics
('Student 5', 3); -- Enrolled in Computer Science
