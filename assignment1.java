public class assignment1 {

    //INSTANCE VARIABLE//
    String name;
    int age;
    double marks;
    char grade;
    boolean isPassed;

    //STATIC VARIABLE//
    static String Collegename="Symbiosis Institute of Technology";

    //CONSTANT (FINAL VARIABLE)//
    static final double Pass_percentage=40.0;
    
    //======CONSTRUCTORS=====//

    //DEAFULT CONSTRUCTOR//
    
    public assignment1() {
        name="unknown";
        age=0;
        marks=0.0;
        grade='-';
        isPassed= false;
        System.out.println("[Deafult Constructor Called]");
    }

    //PARAMETERIZED CONSTRUCTOR//

    public assignment1(String studentName, int studentAge , double mark ){
        name= studentName;
        age= studentAge;
        marks=mark;
        grade='-';
        isPassed= false;
        System.out.println("[Parmeterized Constructor (name, age) called]");
    }

    //=======METHODS========//

    //STATIC METHOD //

    static void showCollegeInfo() {
        System.out.println("Welcome to "+ Collegename);
    }

    //INSTANCE METHOD//

    void displayDetails() {
        System.out.println("-------Student Details-------");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);
        System.out.println("Grade :"+ grade);
        System.out.println("Passing Status:"+ isPassed);
    
    }


    // METHOD WITH A RETURN VALUE AND PARAMETERIZED METHODS//
    String calculateGrade(double studentMarks) {
        String result;
        if (studentMarks >= 90) {
            result= "A ";
        
        } else if (studentMarks >=75) {
            result=" B";

        } else if (studentMarks >=40) {
            result="C";

        }else {
            result="F";
        }
        return result;

    
    

    }
    //Main METHOD//

    public static void main(String[] args) {
        
        showCollegeInfo();
        System.out.println();

        //DISPLAY DEAFULT CONSTRUCTOR//

        System.out.println(" Student 1(Default Constructor ");
        assignment1 student1= new assignment1();
        student1.displayDetails();
        System.out.println();

        System.out.println(">>> Creating Student 2 (name, age constructor)");
        assignment1  student2 = new assignment1("Riya Sharma", 19,37);
        student2.displayDetails();
        System.out.println();
    
    }



}
