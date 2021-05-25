create database BookStore;
use BookStore;

create table ROLE(
	ROLE_ID int not null auto_increment,
    ROLE_NAME varchar(12) not null,
    DESCRIPTION nvarchar(100) null,
    
    primary key (ROLE_ID)
);

create table ADDRESS(
	ADDRESS_ID int not null auto_increment,
    COUNTRY varchar(30) not null,
    CITY varchar(30) not null,
    DISTRICT varchar(30) not null,
    WARD varchar(30) not null,
    STREET varchar(30) not null,
    
    primary key (ADDRESS_ID)
);

create table STAFF(
	STAFF_ID int not null auto_increment,
    EMAIL varchar(50) not null unique,
    PASSWORD varchar(100) null,
    FIRST_NAME varchar(15) not null,
    LAST_NAME varchar(15) not null,
    AGE int not null,
    GENDER varchar(10) not null,
    PHONE_NUMBER varchar(12) null unique,
    STATUS tinyint,
    
    primary key (STAFF_ID)
);

create table CUSTOMER(
	CUSTOMER_ID int not null auto_increment,
    EMAIL varchar(50) not null unique,
    PASSWORD varchar(100) null,
    FIRST_NAME varchar(15) not null,
    LAST_NAME varchar(15) not null,
    AGE int not null,
    GENDER varchar(10) not null,
    PHONE_NUMBER varchar(12) null unique,
    RANK_MEMBER int null,
    CREATED_DATE datetime not null,
    STATUS tinyint,
    
    primary key (CUSTOMER_ID)
);

create table STAFF_ROLE(
	STAFF_ID int not null,
    ROLE_ID int not null,
    
    primary key (STAFF_ID, ROLE_ID),
    foreign key (STAFF_ID) references STAFF(STAFF_ID),
    foreign key (ROLE_ID) references ROLE(ROLE_ID)
);

create table ADDRESS_STAFF_CUSTOMER(
    ADDRESS_ID int not null,
    STAFF_ID int null,
    CUSTOMER_ID int null,
    
    primary key (ADDRESS_ID, STAFF_ID, CUSTOMER_ID),
    foreign key (ADDRESS_ID) references ADDRESS(ADDRESS_ID),
    foreign key (CUSTOMER_ID) references CUSTOMER(CUSTOMER_ID),
    foreign key (STAFF_ID) references STAFF(STAFF_ID)
);

create table CATEGORY(
	CATEGORY_ID int not null auto_increment,
    CATEGORY_NAME varchar(50) not null,
    
    primary key (CATEGORY_ID)
);

create table PUBLISHER(
	PUBLISHER_ID int not null auto_increment,
    PUBLISHER_NAME varchar(50) not null,
    
    primary key (PUBLISHER_ID)
);

create table AUTHOR(
	AUTHOR_ID int not null auto_increment,
    AUTHOR_NAME varchar(50) not null,
    
    primary key (AUTHOR_ID)
);

create table DISCOUNT(
	DISCOUNT_ID int not null auto_increment,
    DESCRIPTION varchar(300) null,
    VALUE int not null,
    EXPIRED datetime not null,
    
    primary key (DISCOUNT_ID)
);

create table CUSTOMER_DISCOUNT(
	CUSTOMER_ID int not null,
    DISCOUNT_ID int not null,
    
    primary key (CUSTOMER_ID, DISCOUNT_ID),
    foreign key (CUSTOMER_ID) references CUSTOMER(CUSTOMER_ID),
    foreign key (DISCOUNT_ID) references DISCOUNT(DISCOUNT_ID)
);

create table BOOK(
	BOOK_ID int not null auto_increment,
    TITLE varchar(50) not null,
	EDITION int not null,
    PUBLICATION_DATE datetime not null,
    PRICE bigint not null,
    primary key (BOOK_ID)
);

create table BOOK_DETAIL(
	BOOK_ID int not null,
    AUTHOR_ID int not null,
    PUBLISHER_ID int not null,
    CATEGORY_ID int not null,
    
    primary key (BOOK_ID, AUTHOR_ID, PUBLISHER_ID, CATEGORY_ID),
    foreign key (BOOK_ID) references BOOK(BOOK_ID),
    foreign key (AUTHOR_ID) references AUTHOR(AUTHOR_ID),
    foreign key (PUBLISHER_ID) references PUBLISHER(PUBLISHER_ID),
    foreign key (CATEGORY_ID) references CATEGORY(CATEGORY_ID)
);

create table ORDERS(
	ORDER_ID int not null auto_increment,
    STAFF_ID int not null,
    ORDER_DATE datetime not null,
    
    primary key (ORDER_ID),
    foreign key (STAFF_ID) references STAFF(STAFF_ID)
);

create table ORDER_DETAIL(
	ORDER_DETAIL_ID int not null auto_increment,
    ORDER_ID int not null,
    BOOK_ID int not null,
    CUSTOMER_ID int not null,
    DISCOUNT_ID int not null,
    TOTAL_PRICE bigint not null,
    
    primary key (ORDER_DETAIL_ID),
    foreign key (ORDER_ID) references ORDERS(ORDER_ID),
    foreign key (CUSTOMER_ID) references CUSTOMER(CUSTOMER_ID),
    foreign key (DISCOUNT_ID) references DISCOUNT(DISCOUNT_ID),
    foreign key (BOOK_ID) references BOOK(BOOK_ID)
);

create table REVIEW(
	REVIEW_ID int not null auto_increment,
    STAFF_ID int null,
    CUSTOMER_ID int null,
    BOOK_ID int not null,
    CONTENT varchar(300) null,
    POSTING_DATE datetime not null,
    
    primary key (REVIEW_ID),
    foreign key (STAFF_ID) references STAFF(STAFF_ID),
    foreign key (CUSTOMER_ID) references CUSTOMER(CUSTOMER_ID),
    foreign key (BOOK_ID) references BOOK(BOOK_ID)
);