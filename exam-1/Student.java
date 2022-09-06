public class Student {
    String surname;
    String firstName;
    String middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;
    
    public void sayMysurname () {
        System.out.println("my surname is " +  surname);
    }
     
    public void sayMyfirstName () {
        System.out.println("my First name is " +  firstName);
    }

    public void sayMymiddleInitial () {
        System.out.println("my Middle Initial is " +  middleInitial);
    }

    public void sayMydateOfBirth () {
        System.out.println(" I was born in " +  dateOfBirth);
    }

    public void sayMystudentNumber () {
        System.out.println("my student number is " +  studentNumber);
    }

    public void sayMystudentEmailAddress () {
        System.out.println("my email address is " +  studentEmailAddress);
    }

    public void sayMyiAmAwesome() {
        System.out.println("Am I awesome? " + iAmAwesome);
    }
     
}
