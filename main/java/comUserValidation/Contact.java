package comUserValidation;

public class Contact
{
    private String FIRST_NAME;
    private String LAST_NAME;
    private String ADDRESS;
    private String CITY;
    private String STATE;
    private String EMAIL;
    private int ZIP;
    private long PHONE_NUMBER;
    
    public Contact(String firstName, String lastName, String address, String city, String state, String email, int zip, long phoneNumber)
    {
        FIRST_NAME = firstName;
        LAST_NAME = lastName;
        ADDRESS = address;
        CITY = city;
        STATE = state;
        EMAIL = email;
        ZIP = zip;
        PHONE_NUMBER = phoneNumber;
    }
    
    public String getFIRST_NAME()
    {
        return FIRST_NAME;
    }
    
    public void setFIRST_NAME(String FIRST_NAME)
    {
        this.FIRST_NAME = FIRST_NAME;
    }
    
    public String getLAST_NAME()
    {
        return LAST_NAME;
    }
    
    public void setLAST_NAME(String LAST_NAME)
    {
        this.LAST_NAME = LAST_NAME;
    }
    
    public String getADDRESS()
    {
        return ADDRESS;
    }
    
    public void setADDRESS(String ADDRESS)
    {
        this.ADDRESS = ADDRESS;
    }
    
    public String getCITY()
    {
        return CITY;
    }
    
    public void setCITY(String CITY)
    {
        this.CITY = CITY;
    }
    
    public String getSTATE()
    {
        return STATE;
    }
    
    public void setSTATE(String STATE)
    {
        this.STATE = STATE;
    }
    
    public String getEMAIL()
    {
        return EMAIL;
    }
    
    public void setEMAIL(String EMAIL)
    {
        this.EMAIL = EMAIL;
    }
    
    public int getZIP()
    {
        return ZIP;
    }
    
    public void setZIP(int ZIP)
    {
        this.ZIP = ZIP;
    }
    
    public long getPHONE_NUMBER()
    {
        return PHONE_NUMBER;
    }
    
    public void setPHONE_NUMBER(long PHONE_NUMBER)
    {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }
    
    @Override
    public String toString()
    {
        return "Contact{" + "\n" + "FIRST_NAME = " + FIRST_NAME + "\n"+ "LAST_NAME = " +
                        LAST_NAME  + "\n" + "ADDRESS = " + ADDRESS + "\n"+ "CITY = " + CITY + "\n"+
                        "STATE = " + STATE + "\n" + "EMAIL = " + EMAIL + "\n" +
                        "ZIP = " + ZIP + "\n" + "PHONE_NUMBER = " + PHONE_NUMBER + "\n" + '}';
    }
}
