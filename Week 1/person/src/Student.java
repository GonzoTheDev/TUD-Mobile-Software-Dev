interface PublishDetails {
    void confirmDetails();
    void getCourseCode();
}
public class Student extends Person implements PublishDetails{

    public void confirmDetails() {
        System.out.println(this.getName());
    }
    public void getCourseCode() {
        System.out.println(this.getcourseCode());
    }

    static int counter;
    private int studentID;
    private String courseCode;

    public void student(String courseCode, String name, char gender) {
        this.studentID = counter;
        counter++;
        this.courseCode = courseCode;
        this.setGender(gender);
        this.setName(name);
    }
    public int getStudentID() {
        return studentID;
    }
    public String getcourseCode() {
        return courseCode;
    }

    public String toString() {
        String gen;
        String pronoun;
        char gender = this.getGender();
        String name = this.getName();

        if(gender == 'M'){
            gen = "Male";
            pronoun = "His";
        }
        else if(gender == 'F'){
            gen = "Female";
            pronoun = "Her";
        }
        else if(gender == 'U'){
            gen = "Non-binary";
            pronoun = "Their";
        }
        else {
            gen = "Error";
            pronoun = "Null";
        }
        return "\n------------------------------\nSTUDENT INFORMATION\n------------------------------\nThis persons name is: " + name + ".\n" + pronoun + " gender is: " + gen + ".\n" + pronoun + " student ID is: " + studentID + ".\n" + pronoun + " course code is: " + courseCode + ".\n------------------------------\n";
    }

}   
