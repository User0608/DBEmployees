CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insertEmployees`(p_emp_no int(11),p_birth_date date,
			p_first_name varchar(14),p_last_name varchar(16),p_gender char(1),p_hire_date date)
BEGIN

insert into employees(emp_no,birth_date,first_name,last_name,gender,hire_date)
	values(p_emp_no,p_birth_name,p_first_date,p_last_name,p_gender,p_hire_date);
END