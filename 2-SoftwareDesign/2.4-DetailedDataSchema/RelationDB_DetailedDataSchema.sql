CREATE TABLE User_Info (
    user_info_id INT PRIMARY KEY,
    allergies_or_diseases VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE Request_Food (
    request_food_id INT PRIMARY KEY,
    user_id INT NOT NULL,
    advice_text TEXT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES User(user_id)
);

CREATE TABLE Request_Relationship (
    request_relationship_id INT PRIMARY KEY,
    user_id INT NOT NULL,
    advice_text TEXT NOT NULL CHECK (LENGTH(advice_text) >= 25),
    FOREIGN KEY (user_id) REFERENCES User(user_id)
);

CREATE TABLE Relationship_Expert (
    expert_id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    position VARCHAR(255) NOT NULL
);

CREATE TABLE Expert_Request (
    expert_request_id INT PRIMARY KEY,
    user_id INT NOT NULL,
    expert_id INT NOT NULL,
    request_text TEXT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES User(user_id),
    FOREIGN KEY (expert_id) REFERENCES Relationship_Expert(expert_id)
);

CREATE TABLE Response (
    response_id INT PRIMARY KEY,
    expert_id INT NOT NULL,
    expert_request_id INT NOT NULL,
    response_text TEXT NOT NULL,
    date DATE NOT NULL,
    FOREIGN KEY (expert_id) REFERENCES Relationship_Expert(expert_id),
    FOREIGN KEY (expert_request_id) REFERENCES Expert_Request(expert_request_id)
);

CREATE TABLE User (
    user_id INT PRIMARY KEY,
    login VARCHAR(255) NOT NULL CHECK (login ~ '^[A-Z][a-zA-Z]*$'),
    password VARCHAR(255) NOT NULL CHECK (password ~ '^(?=.*[a-z])(?=.*[A-Z])(?=.*\d).+$'),
    user_info_id INT NOT NULL,
    request_food_id INT,
    request_relationship_id INT,
    expert_request_id INT,
    FOREIGN KEY (user_info_id) REFERENCES User_Info(user_info_id),
    FOREIGN KEY (request_food_id) REFERENCES Request_Food(request_food_id),
    FOREIGN KEY (request_relationship_id) REFERENCES Request_Relationship(request_relationship_id),
    FOREIGN KEY (expert_request_id) REFERENCES Expert_Request(expert_request_id)
);
