package B1.naztech.BankManagement;

import org.junit.Test;

import Implement.ImplementationOfTake;
import junit.framework.TestCase;

public class MethodTest extends TestCase {
	ImplementationOfTake impt = new ImplementationOfTake();
	
	@Test
	public void testNamesFromCustomer() {
		assertEquals(true, impt.namesFromCustomer());
	}
	
	@Test
	public void testBranchesFromLoan() {
		assertEquals(true, impt.branchesFromLoan());
	}
	
	@Test
	public void testEntireBranchTable() {
		assertEquals(true, impt.entireBranchTable());
	}
	
	@Test
	public void testFindFromAccount() {
		assertEquals(true, impt.findFromAccount());
	}
	
	@Test
	public void testSelectedFromAccount() {
		assertEquals(true, impt.selectedFromAccount(400));
	}
	
	@Test
	public void testSelectedAccountNoFromAccount() {
		assertEquals(true, impt.selectedAccountNoFromAccount(700));
	}
	
	@Test
	public void testSelectedAccountNoAndBalanceFromAccount() {
		assertEquals(true, impt.selectedAccountNoBalanceFromAccount(800, "Brighton"));
	}
	
	@Test
	public void testAllBranchNameAndAssetsFromBranch() {
		assertEquals(true, impt.allBranchNameAndAssetsFromBranch());
	}
	
	@Test
	public void testSelectedBranchNameFromBranch() {
		assertEquals(true, impt.selectedBranchNameFromBranch());
	}
}
