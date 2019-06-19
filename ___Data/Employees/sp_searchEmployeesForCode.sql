CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_searchEmployeesForCode`(p_emp_no int(11))
BEGIN
	select * from employees where emp_no=p_emp_no;
END