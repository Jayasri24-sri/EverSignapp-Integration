package org.example.eversign.model;

public class EversignDocument
{
    private String title;
    private String message;
    private String signerEmail;
    private String signerName;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getSignerName()
    {
        return signerName;
    }

    public void setSignerName(String signerName)
    {
        this.signerName = signerName;
    }

    public String getSignerEmail()
    {
        return signerEmail;
    }

    public void setSignerEmail(String signerEmail)
    {
        this.signerEmail = signerEmail;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }


}
