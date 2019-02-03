package Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Borrower {
	private String customer_id;
	private String customer_name;
	private String loan_number;
}
