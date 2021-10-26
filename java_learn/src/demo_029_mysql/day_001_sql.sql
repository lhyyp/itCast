SELECT * FROM helloWord
#创建库
create DATABASE IF NOT EXISTS DB1;
#产看所有的库
show DATABASES;
#删除库
drop DATABASE if EXISTS DB1;
#使用库
USE lhyYp;
SELECT DATABASE();
# 创建表
create table if not EXISTS person(
	id int,
	name VARCHAR(32),
	age INT,
	score DOUBLE(4, 1),
	birthday date,
	inset_time TIMESTAMP
);
# 复制表
create table student like person;
#删除表
drop TABLE if EXISTS person;
# 修改表名
alter table student rename to teacher;
# 查看表信息
show create table teacher;
# 修改表的字符集
alter table teacher character set gbk;
# 添加表字段
alter table teacher add sex VARCHAR(10);
# 修改表字段
alter table teacher change gender1 sex VARCHAR(20);
alter table teacher MODIFY column gender VARCHAR(10);

# 插入数据
INSERT INTO teacher (id, name, age,score ) VALUES (1, '张无忌',18, 86);
INSERT INTO teacher (id, name, age,score ) VALUES (2, '周芷若',18, 86);
INSERT INTO teacher (id, name, age,score ) VALUES (3, '赵敏',18, 86);
select * from teacher;
DELETE from teacher where id =1;
# 删除表里的所有数据（有多少数据执行多少次）
DELETE from teacher;
# 删除表里的所有数据（只会执行两次， 先删除表，在创建一个空表）
TRUNCATE table teacher;
# 跟新表字段
UPDATE teacher set age = 117 where id = 1;

# HAVING与WHERE 区别 WHERE条件生效实在查询前， HAVING是对查询后的进行过滤
select
	sex, avg(score),COUNT(id) as num
from
	teacher
WHERE
	score > 70
GROUP BY
	sex
HAVING num > 1;


create table if not EXISTS class(
	id INT PRIMARY key auto_increment,
	name VARCHAR(32) not NULL
);

create table if not EXISTS student(
	id INT PRIMARY key auto_increment,
	phone VARCHAR(20) UNIQUE,
	name VARCHAR(32) not NULL,
	class_id int,
	CONSTRAINT stu_class_fk FOREIGN KEY (class_id) REFERENCES class (id)
);
# 主键约束 primary key 非空且唯一,一张表只能有一个
    ALTER TABLE student DROP PRIMARY key;
    ALTER TABLE student MODIFY id int PRIMARY key;
# 非空约束 not null
    ALTER TABLE student MODIFY name VARCHAR(32);
    ALTER TABLE student MODIFY phone VARCHAR(32) not NULL;
# 唯一约束 unique
    ALTER TABLE student DROP index phone;
    ALTER TABLE student MODIFY phone VARCHAR(32) UNIQUE;
# 外键约束 foreign key
    ALTER TABLE 表名 DROP FOREIGN KEY 外键名;
    ALTER TABLE 表名 add CONSTRAINT 外键名 FOREIGN KEY (外键字段) REFERENCES 主表名称 (主表字段)
    #设置级联更新
        ALTER TABLE 表名 add CONSTRAINT 外键名 FOREIGN KEY (外键字段) REFERENCES 主表名称 (主表字段) ON delete CASCADE
        ALTER TABLE 表名 add CONSTRAINT 外键名 FOREIGN KEY (外键字段) REFERENCES 主表名称 (主表字段) ON UPDATE CASCADE

    # 多表查询
    	# 1、内链接查询
    		# 1-1、隐式内连接
    			select * from student , class where class.id = student.class_id;
    		# 1-2、显式士内连接
    			select * from student INNER JOIN class on class.id = student.class_id;
    	# 2、外链接查询
    		# 2-1 左外连接
    				select * from student LEFT JOIN class on class.id = student.class_id;
    		# 2-2 右外连接
    				select * from student RIGHT JOIN class on class.id = student.class_id;
    	# 3、子查询
    	    # 查腾飞班的学生
    	    select
                *
            from
                student
            where
                class_id = (select id from class where name ="腾飞班");

            # 查班级的人数
                select
                    class.name,
                    t2.num
                from
                    class,
                    (select
                        class_id id,
                        COUNT(id) num
                    from
                            student
                    GROUP BY
                        class_id) t2
                WHERE
                    class.id = t2.id;
            # 添加字段mgr, 自关联当前表id
                alter table student add mgr int;
                ALTER TABLE student add  FOREIGN KEY (mgr) REFERENCES class (id)  ;
                SELECT
                    t1.*,
                    t2.name mgrName
                from
                    student t1
                LEFT JOIN
                    student t2
                ON
                    t1.mgr = t2.id;

#事务
    /**
        * 4、大特征：
            a、原子性：不可分割的最小操作，要么同时成功，要么同时失败
            b、持久性：当事务提交或回滚后，数据库会持久化保存数据
            c、隔离性：多个事务之间，相互独立
            d、一致性：事务操作前后，数据总量不变
    /
    /*
        事务的隔离级别：
          多个事务之间时相互隔离的，相互独立，但是如果多个事务操作同一批数据，则会引发问题，
          问题：
            1、脏读： 一个事务读取另一个事务中没有提交的数据
            2、不可重复读（虚读）： 在同一个事务中，两次读取的数据不一样
            3、幻读：一个事务操作数据表中所有苏剧，另一个事务添加一条数据，则第一个事务查询不到自己的修改
          隔离级别：
            1、read uncommitted: 读未提交
                产生问题：脏读 、不可重复读、幻读
            2、read committed: 读已提交（oracle 默认）
                产生问题：不可重复读、幻读
            3、repeatable read : 可重复读（mysql 默认）
                产生问题：幻读
            4、serializable: 串行化读
                可以解决所有问题
            注意：隔离级别从小到大越来越安全，效率越来越低
            设置数据库隔离级别
                set global transaction isolation level 级别字符串 ;
    */
    # 添加字段账户金额
    alter table student  add balance DOUBLE;
    UPDATE student set  balance  = 1000 ;
    select * from student;
    # 开启事务
        START TRANSACTION;
    # 转账
        UPDATE student set  balance  = balance -100  where id = 1;
        # hh
        UPDATE student set  balance  = balance +100  where id = 2;
    # 提交
        COMMIT;
    # 发现问题 回滚事务
        ROLLBACK;



# mysql 忘记 root 密码
    # 1、net stop mysql;
    # 2、mysqld --skip-grant-tables
    # 3、 打开新窗口 mysql
    #4、 use mysql;
    #5、update user set password = password("新密码") where user =  ”root“;
    #6、关闭两个窗口
    #7、打开任务管理器，关掉mysqld.exe进程
    #8、启动mysql,用新密码登录