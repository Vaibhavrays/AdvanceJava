package Dcp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class Test {

		public static void main(String[] args) throws Exception {
			select();
		}

		public static void select() throws Exception {
			String q = "select id, fname from marksheet";
			Connection con = JdbcDataSource.getConnection();
			
			Statement stmt1 = con.createStatement();
			ResultSet rs1 = stmt1.executeQuery(q);
			
			System.out.println(" db pool connection ");
			System.out.println("ID\fname");
			
			while(rs1.next()) {
				System.out.println(" "+ rs1.getInt(1));
				System.out.println(" "+ rs1.getString(2));
				System.out.println(" *********** ");
			}
//			JdbcDataSource.closeConnection(con, stmt1, rs1);
		}
	}


