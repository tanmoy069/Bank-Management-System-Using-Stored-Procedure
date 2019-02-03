if OBJECT_ID(N't_customer',N'P') is not null
drop procedure t_customer
go

create
PROCEDURE t_customer
AS
BEGIN	
	SELECT customer_name
	FROM customer;
END;