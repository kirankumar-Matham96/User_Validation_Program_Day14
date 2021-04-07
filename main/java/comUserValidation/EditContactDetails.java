package comUserValidation;

public class EditContactDetails
{
    InputFromUser input = new InputFromUser();
    public EditContactDetails(Contact contact)
    {
        //Asking the user to select person contact for editing
        System.out.println("Select the person to edit details: "+"\n"+"1."+contact.getFIRST_NAME()+"\n"+"2.exit");
        
        if(input.intInput() == 1)
        {
    
            //give the options to user to edit
            System.out.println("Select option:" + "\n" + "1.first name" + "\n" + "2.last name" + "\n" + "3.address" + "\n" + "4.city" + "\n" + "5.state" + "\n" + "6.email" + "\n" + "7.zip" + "\n" + "8.phone number" + "\n" + "9.exit");
            InputFromUser inputFromUser = new InputFromUser();
    
            switch(inputFromUser.intInput())
            {
                case 1:
                    System.out.println("Enter first name to change: ");
                    contact.setFIRST_NAME(inputFromUser.stringInput());
                    break;
                case 2:
                    System.out.println("Enter last name to change: ");
                    contact.setLAST_NAME(inputFromUser.stringInput());
                    break;
                case 3:
                    System.out.println("Enter new address to change: ");
                    contact.setADDRESS(inputFromUser.stringInput());
                    break;
                case 4:
                    System.out.println("Enter new city to change: ");
                    contact.setCITY(inputFromUser.stringInput());
                    break;
                case 5:
                    System.out.println("Enter new state to change: ");
                    contact.setSTATE(inputFromUser.stringInput());
                    break;
                case 6:
                    System.out.println("Enter new email to change: ");
                    contact.setEMAIL(inputFromUser.stringInput());
                    break;
                case 7:
                    System.out.println("Enter new zip to change: ");
                    contact.setZIP(inputFromUser.intInput());
                    break;
                case 8:
                    System.out.println("Enter new phone number to change: ");
                    contact.setPHONE_NUMBER(inputFromUser.longInput());
                    break;
                default:
                    System.out.println("Thank you!");
            }
        }
    }
    
}
