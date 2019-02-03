if OBJECT_ID(N't_branch_3',N'P') is not null
drop procedure t_branch_3
go

create
PROCEDURE t_branch_3
AS
BEGIN	
	SELECT branch_name 
	FROM branch
	where assets between 1000000 and 4000000
END;