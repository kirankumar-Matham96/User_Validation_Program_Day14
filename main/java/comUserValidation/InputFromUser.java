package comUserValidation;

import java.util.Scanner;

public class InputFromUser
{
    Scanner sc;
    
    public String stringInput()
    {
        sc = new Scanner(System.in);
        var s = sc.nextLine();
        return s;
    }
    public int intInput()
    {
        sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public long longInput()
    {
        sc = new Scanner(System.in);
        return sc.nextLong();
    }
}
