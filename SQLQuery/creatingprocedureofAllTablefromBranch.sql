if OBJECT_ID(N't_branch',N'P') is not null
drop procedure t_branch
go

create
PROCEDURE t_branch
AS
BEGIN	
SELECT * 
FROM branch;
END;