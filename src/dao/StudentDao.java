package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Student;
import util.BaseDao;

public class StudentDao extends BaseDao{
	
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public List<Student> check() {
		List<Student> lists = new ArrayList<Student>();
		conn = getConn();
		try {
			String sql = "select * from stu";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()){
				Student student = new Student();
				student.setSname(rs.getString(1));
				student.setSage(rs.getInt(2));
				student.setSsex(rs.getString(3));
				lists.add(student);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lists;
	}

}
