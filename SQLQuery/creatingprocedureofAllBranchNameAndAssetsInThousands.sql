if OBJECT_ID(N't_branch_2',N'P') is not null
drop procedure t_branch_2
go

create
PROCEDURE t_branch_2
AS
BEGIN	
	SELECT branch_name, 
	assets/1000 as "assets in thousands"
	FROM branch
END;