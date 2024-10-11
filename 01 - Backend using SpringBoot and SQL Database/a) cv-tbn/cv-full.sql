CREATE DATABASE cv_full;
USE cv_full;

CREATE TABLE city(
	id int auto_increment primary key,
    name varchar(30) not null
);

create table tasks(
	id int auto_increment primary key,
    description varchar(50) not null
);

create table soft_skills(
	id int auto_increment primary key,
    skill varchar(20) not null
);

create table hard_skills(
	id int auto_increment primary key,
    skill varchar(20) not null
);

create table courses(
	id int auto_increment primary key,
    name varchar(50) not null,
    institution varchar(30) not null,
    date_start varchar(10),
    date_end varchar(10),
    certification tinyint(1)
);

create table social_media_names(
	id int auto_increment primary key,
    name varchar(15) not null
);

create table social_media(
	id int auto_increment primary key,
    id_name int,
    url varchar(50) not null,
    foreign key (id_name) references social_media_names(id)
);

create table user_info(
	cc int primary key,
    name varchar(30) not null,
    lastname varchar(30) not null,
    phone varchar(15),
    email varchar(25) not null,
    whatsapp varchar(15),
    id_social_media int not null,
    foreign key (id_social_media) references social_media(id)
);

create table experience(
	id int auto_increment primary key,
    title varchar(50) not null,
    company varchar(25) not null,
    date_start varchar(10) not null,
    date_end varchar(10) not null,
    id_city int,
    description varchar (100),
    id_tasks int,
    foreign key (id_city) references city(id),
    foreign key (id_tasks) references tasks(id)
);

create table profile(
	id int auto_increment primary key,
    id_user_info int not null,
    role varchar(50) not null,
    profile_text varchar(200) not null,
    id_soft_skills int not null,
    id_hard_skills int not null,
    id_courses int not null,
    id_experience int not null,
    foreign key (id_user_info) references user_info(cc),
    foreign key (id_soft_skills) references soft_skills(id),
    foreign key (id_hard_skills) references hard_skills(id),
    foreign key (id_courses) references courses(id),
    foreign key (id_experience) references experience(id) 
);

INSERT INTO city (name) 
VALUES 
('Arauca'), 
('Armenia'), 
('Barranquilla'), 
('Bogotá'), 
('Bucaramanga'), 
('Cali'), 
('Cartagena'), 
('Cúcuta'), 
('Florencia'), 
('Ibagué'), 
('Inírida'), 
('Leticia'), 
('Manizales'), 
('Medellín'), 
('Mitú'), 
('Mocoa'), 
('Montería'), 
('Neiva'), 
('Pasto'), 
('Pereira'), 
('Popayán'), 
('Puerto Carreño'), 
('Quibdó'), 
('Riohacha'), 
('San Andrés'), 
('San José del Guaviare'), 
('Santa Marta'), 
('Sincelejo'), 
('Tunja'), 
('Valledupar'), 
('Villavicencio'), 
('Yopal');

INSERT INTO social_media_names (name) 
VALUES 
('LinkedIn'), 
('X'), 
('Facebook'), 
('YouTube'), 
('Instagram'), 
('TikTok'), 
('GitHub'), 
('Web Page');