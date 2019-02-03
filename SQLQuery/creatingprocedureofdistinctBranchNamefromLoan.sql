if OBJECT_ID(N't_loan',N'P') is not null
drop procedure t_loan
go

create
PROCEDURE t_loan
AS
BEGIN	
SELECT distinct(branch_name) 
FROM loan;
END;