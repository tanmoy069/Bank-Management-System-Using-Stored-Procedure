if OBJECT_ID(N't_account',N'P') is not null
drop procedure t_account
go

create
PROCEDURE t_account(@bl int)
AS
BEGIN	
	SELECT account_number
	FROM account where @bl < balance;
END;