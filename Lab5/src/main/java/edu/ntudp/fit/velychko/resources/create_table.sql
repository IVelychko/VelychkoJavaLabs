-- Table: public.Student

-- DROP TABLE IF EXISTS public."Student";

CREATE TABLE IF NOT EXISTS public."Student"
(
    id integer NOT NULL DEFAULT nextval('"Student_id_seq"'::regclass),
    gradebook_id integer NOT NULL,
    first_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    patronymic character varying(255) COLLATE pg_catalog."default" NOT NULL,
    date_of_birth date NOT NULL,
    CONSTRAINT "Student_pkey" PRIMARY KEY (id),
    CONSTRAINT "Student_id_gradebook_id_key" UNIQUE (id, gradebook_id)
)

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Student"
    OWNER to postgres;