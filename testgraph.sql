CREATE TABLE department_demo (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(100),
    created_at TIMESTAMP DEFAULT NOW()
);
CREATE TABLE project_demo (
    id SERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    budget DECIMAL(12,2),
    start_date DATE,
    end_date DATE,
    department_id INT REFERENCES department_demo(id),
    created_at TIMESTAMP DEFAULT NOW()
);

