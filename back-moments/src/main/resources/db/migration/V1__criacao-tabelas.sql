CREATE TABLE moment
(
    id         BIGINT NOT NULL AUTO_INCREMENT,
    title      VARCHAR(30),
    description VARCHAR(120),
    image      VARCHAR,
    created_at  TIMESTAMP WITH TIME ZONE,
    updated_at TIMESTAMP WITH TIME ZONE,

    PRIMARY KEY (id)
);
CREATE TABLE comment
(
    id        BIGINT NOT NULL AUTO_INCREMENT,
    userName  VARCHAR(30),
    text      VARCHAR,
    momentId  BIGINT NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE,
    updated_at TIMESTAMP WITH TIME ZONE,

    PRIMARY KEY (id),
    CONSTRAINT fk_comment_moment
        FOREIGN KEY (momentId)
            REFERENCES moment (id)
)