if OBJECT_ID(N't_account_2',N'P') is not null
drop procedure t_account_2
go

create
PROCEDURE t_account_2(@bl int,@bName varchar(50))
AS
BEGIN	
	SELECT account_number, balance
	FROM account where @bl < balance and branch_name = @bName;
END;