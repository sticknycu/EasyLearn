CREATE TABLE IF NOT EXISTS
    users (
                   user_id SERIAL,
                   password VARCHAR,
                   email VARCHAR,

                   PRIMARY KEY (user_id)
    );
