class Student{

	int static studentGrade;
	
	int studentName;
	
	public Student(String name){
		System.out.println("The student's name is " + studentName);
	}
	
	public void setGrade(int grade){
		studentGrade = grade;
	}
	
	public static int getGrade(){
		System.out.println("The student is in grade " + studentGrade);
		return studentGrade;
	}
	
	Student andrew = new StudentName("Andrew");
	
	public static void main(String []args){

	      Student.setGrade(12);

	      Student.getGrade();

	      System.out.println("Variable Value :" + Student.studentGrade); 
	}
	
}
