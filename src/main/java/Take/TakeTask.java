package Take;

public interface TakeTask {
	boolean namesFromCustomer();
	boolean branchesFromLoan();
	boolean entireBranchTable();
	boolean findFromAccount();
	boolean selectedFromAccount(int balance);
	boolean selectedAccountNoFromAccount(int balance);
	boolean selectedAccountNoBalanceFromAccount(int balance,String branchname);
	boolean allBranchNameAndAssetsFromBranch();
	boolean selectedBranchNameFromBranch();
}
