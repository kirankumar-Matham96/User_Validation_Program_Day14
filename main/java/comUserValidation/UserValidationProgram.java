package comUserValidation;

import java.util.Locale;

public class UserValidationProgram
{
    //variables
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    int zip;
    long phoneNumber;
    
    //Conyact class object
    Contact contact;
    
    //scanner input
    InputFromUser input = new InputFromUser();
    
    //method to take inputs from user
    public void takesInput()
    {
        System.out.println("Enter first name");
        firstName = input.stringInput();
        
        System.out.println("Enter last name");
        lastName = input.stringInput();
        
        System.out.println("Enter address");
        address = input.stringInput();
        
        System.out.println("Enter city");
        city = input.stringInput();
        
        System.out.println("Enter state");
        state = input.stringInput();
        
        System.out.println("Enter email");
        email = input.stringInput();
        
        System.out.println("Enter zip");
        zip = input.intInput();
        
        System.out.println("Enter phone number");
        phoneNumber = input.longInput();
    }
    
    //main method
    public static void main(String[] args)
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        
        //calling method to take inputs
        userValidationProgram.takesInput();
        
        //calling Contact class
        userValidationProgram.contact = new Contact(userValidationProgram.firstName,
                                        userValidationProgram.lastName,
                                        userValidationProgram.address,
                                        userValidationProgram.city,
                                        userValidationProgram.state,
                                        userValidationProgram.email,
                                        userValidationProgram.zip,
                                        userValidationProgram.phoneNumber);
        System.out.println(userValidationProgram.contact);
    
        System.out.println("Do you want to edit details? y/n");
        String option = userValidationProgram.input.stringInput();
        if(option.equals("y"))
        {
            EditContactDetails editContactDetails = new EditContactDetails(userValidationProgram.contact);
        }
        System.out.println(userValidationProgram.contact);
        
    }
}
