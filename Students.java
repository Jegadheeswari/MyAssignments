package week3.day1;

public class Students {

public void getStudentInfo(int id) {
	System.out.println("Student Id is"+" " + id);
}
public void getStudentInfo(int id, String Name) {
	System.out.println("Student Id:"+" " + id +"  and Name:" + Name);
}
public void getStudentInfo(String email, int PhoneNumber) {
	System.out.println("Email:" + email +"PhoneNumber" + " "+PhoneNumber);
}
public static void main(String[] args) {
	Students obj = new Students();
	obj.getStudentInfo(111);
	obj.getStudentInfo(222, "Anitha");
	obj.getStudentInfo("anitha@gmail.com", +91-9999999);
}

}