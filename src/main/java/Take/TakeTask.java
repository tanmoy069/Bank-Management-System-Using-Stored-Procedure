package Take;

import Model.Account;
import Model.Branch;
import Model.Customer;
import Model.Loan;

public interface TakeTask {
	boolean namesFromCustomer();
	boolean branchesFromLoan();
	boolean entireBranchTable();
	boolean findFromAccount();
	boolean selectedFromAccount(int balance);
}
