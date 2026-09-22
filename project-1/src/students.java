public class students {
    String coursename;
    static int numberofstudents;
    int studentstotal;
    public students(String cname, int nos, int tot) {
        coursename = cname;
        numberofstudents = nos;
        studentstotal = tot;
    }
    public void displaydetails(){
        System.out.println("course name " +coursename);
        System.out.println("number of students" +numberofstudents);
        System.out.println("total number of students " +studentstotal);
    }

}
