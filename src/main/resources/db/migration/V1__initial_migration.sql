CREATE table book
(
    id           INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    title        VARCHAR(255),
    created_user VARCHAR(255),
    CONSTRAINT pk_book PRIMARY KEY (id)
)