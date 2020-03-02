package service;

import java.util.List;

import dao.StudentDao;
import entity.Student;

public class StudentService {
	private StudentDao sd = new StudentDao();
	public List<Student> check() {
		List<Student> lists = sd.check();
		if(lists!=null ) {
			return lists;
		}else {
			return null;
		}
	}

}
