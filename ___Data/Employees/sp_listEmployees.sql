CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listEmployees`()
BEGIN
	select * from employees;
END