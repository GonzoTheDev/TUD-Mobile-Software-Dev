public class Control {
    public static void main(String[] args) throws Exception {
        Person Person1 = new Person();
        Person Person2 = new Person();

        Person1.setName("Shane");
        Person1.setGender('M');
        Person2.setName("Barbara");
        Person2.setGender('F'); 
        
        Person1.genderValidation();
        Person2.genderValidation();

        
        System.out.print(Person1);
        System.out.print(Person2);

        Student Student1 = new Student();

        Student1.student("TU856", "Shane", 'M');

        Student1.genderValidation();

        System.out.print(Student1);

        Student1.confirmDetails();
        Student1.getCourseCode();

        System.out.println("\n");

        Student Student2 = new Student();

        Student2.student("TU856", "Sean", 'M');

        Student2.genderValidation();

        System.out.print(Student2);

        Student2.confirmDetails();
        Student2.getCourseCode();

        System.out.println("\n");

        /*boolean person_result1 = Person1 instanceof Person;
        boolean person_result2 = Person1 instanceof Student;
        boolean person_result3 = Person1 instanceof PublishDetails;
        boolean student_result1 = Student1 instanceof Person;
        boolean student_result2 = Student1 instanceof Student;
        boolean student_result3 = Student1 instanceof PublishDetails;*/

        /*if(person_result1){
            System.out.println("Person Test 1 Pass.");
        }else{
            System.out.println("Person Test 1 Fail.");
        }
        if(person_result2){
            System.out.println("Person Test 2 Pass.");
        }else{
            System.out.println("Person Test 2 Fail.");
        }
        if(person_result3){
            System.out.println("Person Test 3 Pass.");
        }else{
            System.out.println("Person Test 3 Fail.");
        }
        if(student_result1){
            System.out.println("Student Test 1 Pass.");
        }else{
            System.out.println("Student Test 1 Fail.");
        }
        if(student_result2){
            System.out.println("Student Test 2 Pass.");
        }else{
            System.out.println("Student Test 2 Fail.");
        }
        if(student_result3){
            System.out.println("Student Test 3 Pass.");
        }else{
            System.out.println("Student Test 3 Fail.");
        }*/
    }
}
