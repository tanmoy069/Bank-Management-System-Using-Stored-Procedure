package Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Loan {
	private String loan_number;
	private String branch_name;
	private int amount;
	private String customer_id;
}
