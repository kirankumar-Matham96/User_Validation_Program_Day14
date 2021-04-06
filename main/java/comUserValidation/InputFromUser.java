package comUserValidation;

import java.util.Scanner;

public class InputFromUser
{
    Scanner sc = new Scanner(System.in);
    
    public String stringInput()
    {
        return sc.nextLine();
    }
    public int intInput()
    {
        return sc.nextInt();
    }
    public long longInput()
    {
        return sc.nextLong();
    }
}
