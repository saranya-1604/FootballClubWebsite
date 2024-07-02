package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class MatchDao {

        Connection con;
        PreparedStatement pst;
        ResultSet rs;


        public MatchDao() {
        	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vsbDb" , "root", "root");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

        }

		public void storeData(Match m) {
			// TODO Auto-generated method stub
			String sql = " insert into matchDetails(title,place,date) values(?,?,?) ";
			try {
				pst = con.prepareStatement(sql);
				pst.setString(1,m.getTitle());
			    pst.setString(2,m.getPlace());
			    pst.setString(3,m.getDt());
				pst.executeUpdate();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void storeticketbookingData(Match m) {
			// TODO Auto-generated method stub
			String sql = " insert into ticketbookingdetails(name,age,gender,address,match,matchdate) values(?,?,?,?,?,?) ";
			try {
				pst = con.prepareStatement(sql);
				pst.setString(1,m.getName());
			    pst.setString(2,m.getAge());
			    pst.setString(3,m.getGender());
			    pst.setString(4,m.getAddress());
			    pst.setString(5,m.getMatch());
			    pst.setString(6,m.getMatchdate());
				pst.executeUpdate();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
public ResultSet retrieveMatch() {
	String sql="Select * from matchdetails";
	try {
		pst=con.prepareStatement(sql);
		rs=pst.executeQuery();
	}
	catch(Exception e){}
	
	return rs;
	
}


}
