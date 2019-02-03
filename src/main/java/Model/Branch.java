package Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Branch {
	private String branch_name;
	private String branch_city;
	private int assets;
}
