CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_updateEmployees`(p_emp_no int(11),p_birth_date date,
			p_first_name varchar(14),p_last_name varchar(16),p_gender char(1),p_hire_date date)
BEGIN
	update employees set birth_date=p_birth_date,first_name=p_first_name,
    last_name=p_last_name,gender=p_gender,hire_date=p_hire_date where emp_no=p_emp_no;
END