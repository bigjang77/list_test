### 테이블 생성
```sql
create table users(
    id number primary key,
    username varchar2(20),
    password varchar2(20),
    email varchar2(50),
    createdAt TIMESTAMP
);

CREATE SEQUENCE users_seq 
INCREMENT BY 1 
START WITH 1;
```

### 더미데이터 추가
```sql
iINSERT INTO USER(NAME, job, createdAt) VALUES("momo", "가수", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("soso", "가수", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("roro", "가수", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("coco", "댄서", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("bobo", "댄서", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("wowo", "댄서", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("toto", "경찰", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("nono", "경찰", NOW());
INSERT INTO USER(NAME, job, createdAt) VALUES("yoyo", "경찰", NOW());
```

###테이블생성 2
```
create table company(
    company_id int primary KEY auto_increment,
    company_number INT NOT null,
    company_name VARCHAR(24) NOT null,
    company_email VARCHAR(64) NOT null,
    company_tel VARCHAR(24) NOT null,
    company_location VARCHAR(256) NOT null,
    job_id INT NOT null,
    company_username VARCHAR(24) NOT null,
    company_password VARCHAR(24) NOT null
);
```

###더미데이터 추가2
```
INSERT INTO company
(company_number, company_name, company_email, company_tel, company_location, job_id, company_username, company_password)
VALUES(621070, '삼성전자', 'aabb@samsung.com', '0212341234', '부산시 부산진구 어디어디', 2, 'samsungman1234', 'q1w2e3r4');
INSERT INTO company
(company_number, company_name, company_email, company_tel, company_location, job_id, company_username, company_password)
VALUES(110152, '보성엔지니어링', 'ebz2@bosung.com', '0516010864', '부산시 부산진구 초량동 어디어디', 3, 'bosung1234', 'q1w2e3r4!!');
INSERT INTO company
(company_number, company_name, company_email, company_tel, company_location, job_id, company_username, company_password)
VALUES(117242, 'LG전자', 'veda@lgelectronic.com', '0255221854', '부산시 부산진구 어디어디', 1, 'LGman1234', 'q1w2e3r4!@');
```