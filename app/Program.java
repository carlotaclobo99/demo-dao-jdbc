package app;
import java.text.*;
import db.DbIntegrityException;
import db.DB;
import db.DbException;
import java.sql.*;
import java.io.*;
import model.entities.*;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Department department = new Department(1, "Cars");
		Seller seller = new Seller(12, "Maria", "mail", sdf.parse("12/11/1999"), 1500.00, department);
		System.out.println(seller);
	}
}
