CREATE TABLE employee_demo (
    id SERIAL PRIMARY KEY,          -- Integer (auto-increment)
    name VARCHAR(100),              -- String
    age INTEGER,                    -- Number (whole)
    salary DECIMAL(10,2),           -- Decimal number
    is_active BOOLEAN,              -- True/False
    join_date DATE,                 -- Date only
    created_at TIMESTAMP,           -- Date and time
    remarks TEXT                    -- Long text
);
