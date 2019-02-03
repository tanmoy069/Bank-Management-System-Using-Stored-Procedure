package Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private String employee_name;
	private String branch_name;
	private int salary;
}
