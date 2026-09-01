import java.util.Scanner;
public class assignmentextra {
    String name;
    int RollNo;
    double ScienceMarks;
    double MathsMarks;
    double EnglishMarks;


    

public  assignmentextra(String name, int RollNo, double ScienceMarks,double MathsMarks,double EnglishMarks){
    this.name = name;
    this.RollNo = RollNo;
    this.ScienceMarks =  ScienceMarks;
    this.MathsMarks= MathsMarks;
    this.EnglishMarks= EnglishMarks;




}
double totalMarks(double ScienceMarks , double MathsMarks, double EnglishMarks,double total ){
    total=ScienceMarks+MathsMarks+EnglishMarks;
    return(total);
}
double averageMarks(double ScienceMarks,double MathsMarks, double EnglishMarks,double average){
    average=(ScienceMarks+MathsMarks+EnglishMarks)/3;
    return (average);
}
String grade(double averageMarks,String result){
    if (averageMarks>40) {
        result="Pass";
    }
    else {
        result="Fail";
    
    }
    return (result);

}

public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter Student Name: ");
    String name= scanner.nextLine();
    System.out.println("Enter Roll No : ");
    int RollNo= scanner.nextInt();
    System.out.println("Enter Science Marks:");
    double ScienceMarks= scanner.nextDouble();
    System.out.println("Enter Maths Marks:");
    double MathsMarks= scanner.nextDouble();
    System.out.println("Enter English Marks");
    double EnglishMarks= scanner.nextDouble();
    assignmentextra student= new assignmentextra(name,RollNo,ScienceMarks,MathsMarks,EnglishMarks);
    System.out.println("Name: "+student.name);
    System.out.println("RollNo: "+student.RollNo);
    System.out.println("Total Marks:" +student.totalMarks(ScienceMarks, MathsMarks, EnglishMarks, EnglishMarks));
    System.out.println("Average :"+ student.averageMarks(ScienceMarks, MathsMarks, EnglishMarks, EnglishMarks));
    System.out.println("Grade:"+student.grade(EnglishMarks, name));

    scanner.close();

}
}

