package Implement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Model.Account;
import Model.Branch;
import Model.Customer;
import Model.Loan;
import Take.TakeTask;
import dbUtil.DBConnection;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class ImplementationOfTake implements TakeTask {
	private static final Logger logger = LoggerFactory.getLogger(ImplementationOfTake.class);
	private static Connection myConn = DBConnection.getConnection();
	private static CallableStatement myStmt = null;
	
	@Override
	public boolean namesFromCustomer() {
		try {
			log.info("Names from Loan");
			myStmt = myConn.prepareCall("{ call t_customer() }");
			ResultSet rs = myStmt.executeQuery();
			while(rs.next()) {
				String name = rs.getString("customer_name");
				System.out.printf("%s\n", name);
			}
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean branchesFromLoan() {
		try {
			log.info("Branch Names from Loan");
			myStmt = myConn.prepareCall("{ call t_loan() }");
			ResultSet rs = myStmt.executeQuery();
			while(rs.next()) {
				String bName = rs.getString("branch_name");
				System.out.printf("%s\n", bName);				
			}
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean entireBranchTable() {
		try {
			log.info("Entire Table from Branch");
			myStmt = myConn.prepareCall("{ call t_branch() }");
			ResultSet rs = myStmt.executeQuery();
			while(rs.next()) {
				String bName = rs.getString("branch_name");
				String bCity = rs.getString("branch_city");
				String ast = rs.getString("assets");
				System.out.printf("%s, %s, %s\n", bName,bCity,ast);
			}
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean findFromAccount() {
		try {
			log.info("Name, Account No, Balance from Account");
			myStmt = myConn.prepareCall("{ call query_8() }");
			ResultSet rs = myStmt.executeQuery();
			while(rs.next()) {
				String aName = rs.getString("customer_name");
				String aNo = rs.getString("account_number");
				//String bName = rs.getString("branch_name");
				int bAc = rs.getInt("balance");
				System.out.printf("%s, %s, %d\n", aName, aNo,bAc);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean selectedFromAccount(int balance) {
		try {
			log.info("Name, Account No, Balance from Account where balance is $400 or less. ");			
			myStmt = myConn.prepareCall("{ call query_9(?) }");
			myStmt.setInt(1, balance);
			ResultSet rs = myStmt.executeQuery();
			while(rs.next()) {
				String aName = rs.getString("customer_name");
				String aNo = rs.getString("account_number");
				//String bName = rs.getString("branch_name");
				int bAc = rs.getInt("balance");
				System.out.printf("%s, %s, %d\n", aName, aNo,bAc);
			}
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
}
