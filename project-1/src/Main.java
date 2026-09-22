public class Main {
    public static void main(String[] args){
        students obj1 = new students("software engineering", 65, 80);
        students obj2 = new students("architecture", 15, 30);
        students obj3 = new students("mechatronics", 20, 73);
        int numberofcourses = 3;
        int overalltotalstudents = obj1.studentstotal + obj2.studentstotal + obj3.studentstotal;
        int averagestudents = overalltotalstudents/numberofcourses;
    }
}
