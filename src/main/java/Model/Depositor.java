package Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Depositor {
	private String customer_id;
	private String customer_name;
	private String account_number;
}
