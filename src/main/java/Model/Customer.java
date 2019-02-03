package Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
	private String customer_id;
	private String customer_name;
	private String customer_street;
	private String customer_city;
}
