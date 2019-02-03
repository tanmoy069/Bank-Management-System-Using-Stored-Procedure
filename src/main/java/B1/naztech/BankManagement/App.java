package B1.naztech.BankManagement;

import Implement.ImplementationOfTake;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ImplementationOfTake imt = new ImplementationOfTake();
        imt.namesFromCustomer();
        imt.branchesFromLoan();
        imt.entireBranchTable();
        imt.findFromAccount();
        imt.selectedFromAccount(400);
    }
}
