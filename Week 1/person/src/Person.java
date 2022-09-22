public class Person {
    private String name;
    private char gender;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        String gen;
        String pronoun;
        if(gender == 'M'){
            gen = "Male";
            pronoun = "His";
        }
        else if(gender == 'F'){
            gen = "Female";
            pronoun = "Her";
        }
        else if(gender == 'U'){
            gen = "Undisclosed";
            pronoun = "Their";
        }
        else {
            gen = "Error";
            pronoun = "Their";
        }
        return "\nThis persons name is: " + name + ". " + pronoun + " gender is: " + gen + ".";
    }

    public void genderValidation() {
        if(gender == 'M' || gender == 'F' || gender == 'U' )
        {
            ;
        } else {
            System.out.println("\nError: Invalid value for gender: " + gender + ", please check Person: " + name);
            System.exit(-1);
        }
    }
}
