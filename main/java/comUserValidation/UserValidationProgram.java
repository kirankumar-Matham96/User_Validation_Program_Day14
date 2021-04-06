package comUserValidation;

public class UserValidationProgram
{
    //main method
    public static void main(String[] args)
    {
        Contact contact = new Contact("Kiran","Kumar","Near house",
                                        "My cuty","My state","myeamil@gmail.com",
                                        501526,9586231470L);
        System.out.println(contact.toString());
    }
}
