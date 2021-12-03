class Teacher
{
String designation = "Teacher";
String collegeName = "GVAIET";
}

class PhysicsTeacher extends Teacher
{
String Subject = "Physics";
public static void main(String args[])
{
PhysicsTeacher obj = new PhysicsTeacher();
System.out.println(obj.collegeName);
System.out.println(obj.designation);
System.out.println(obj.Subject);
}
}


