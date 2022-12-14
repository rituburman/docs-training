package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.beans.Account;
import com.connection.GetConnection;

public class AccountDAO implements IAccountDAO {

	PreparedStatement ps = null;

	public AccountDAO() {

	}

	public boolean createAcc(Account account) {
		String sql = "insert into account values(?,?,?,?,?,?,?,?)";
		try {
			ps = GetConnection.getSql().prepareStatement(sql);
			ps.setString(1, account.getUsername());
			ps.setString(2, account.getFirstname());
			ps.setString(3, account.getLastname());
			ps.setString(4, account.getMobNo());
			ps.setString(5, account.getEmail());
			ps.setString(6, account.getAddress());
			ps.setDouble(7, account.getBalance());
			ps.setString(8, account.getAccNo());

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public double checkBalance(String accNo) {
		String sql = "select balance from account where acc_no =?";
		try {
			double bal = 0;
			ps = GetConnection.getSql().prepareStatement(sql);
			ps.setString(1, accNo);
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {
				bal = resultSet.getDouble(1);
				return bal;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;

	}

	public String withdraw(double amount, String accNo) {

		String sql = "update account set balance = balance - ? where acc_no =?";
		try {
			ps = GetConnection.getSql().prepareStatement(sql);
			ps.setDouble(1, amount);
			ps.setString(2, accNo);
			ps.executeUpdate();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return "Amount withdrawn :: " + amount;
	}

	public String deposit(double amount, String accNo) {
		String sql = "update account set balance = balance + ? where acc_no =?";
		try {
			ps = GetConnection.getSql().prepareStatement(sql);
			ps.setDouble(1, amount);
			ps.setString(2, accNo);
			ps.executeUpdate();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return "Amount deposited :: " + amount;

	}

	public void getAccount(String accNo) {
		String sql = "select username, firstname, lastname, mobile, email, address, balance from account where acc_no =?";
		try {
			ps = GetConnection.getSql().prepareStatement(sql);
			ps.setString(1, accNo);
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {
				System.out.println("Username: " + resultSet.getString(1));
				System.out.println("First Name: " + resultSet.getString(2));
				System.out.println("Last Name: " + resultSet.getString(3));
				System.out.println("Mobile Number: " + resultSet.getString(4));
				System.out.println("Email: " + resultSet.getString(5));
				System.out.println("Address: " + resultSet.getString(6));
				System.out.println("Balance: " + resultSet.getDouble(7));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
