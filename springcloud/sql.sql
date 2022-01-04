
/*
 创建db01数据库
 */
CREATE DATABASE `DB01`CHARACTER SET utf8 COLLATE utf8_general_ci;


/*
创建dept表
deptno: 主键id
dname： 名字
db_source: 数据库名字
 */
CREATE TABLE `DB01`.`dept` ( `deptno` BIGINT NOT NULL AUTO_INCREMENT, `dname` VARCHAR(60), `db_source` VARCHAR(60), PRIMARY KEY (`deptno`) ) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_general_ci;

/*
 插入5条测试数据
 */
INSERT INTO dept (dname,db_source) VALUES ("开发部",DATABASE());
INSERT INTO dept (dname,db_source) VALUES ("人事部",DATABASE());
INSERT INTO dept (dname,db_source) VALUES ("财务部",DATABASE());
INSERT INTO dept (dname,db_source) VALUES ("市场部",DATABASE());
INSERT INTO dept (dname,db_source) VALUES ("运维部",DATABASE());


/*
 查询所有数据
 */
SELECT * FROM dept;


