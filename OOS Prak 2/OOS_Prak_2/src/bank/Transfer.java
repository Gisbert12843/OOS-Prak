package bank;

/**
 * represents a Transfer which inherits from Transaction while providing the additional attributes sender and recipient
 *
 */
public class Transfer extends Transaction//Used to represent a Bank-Transfer
{
    /**
     * represents the sender of the Transfer
     */
    String sender;
    /**
     * represents the recipient of the Transfer
     */
    String recipient;

    ////////////////////////////////////////////////
    /**
     * constructs a Transfer-Object with bare minimum attributes
     */
    public Transfer(String pDate, double pAmount, String pDescription)
    {//Creates a new Payment that has no Sender or Recipient linked to it
        super(pDate, pAmount, pDescription);
    }

    /**
     * constructs a full-fledged Transfer-Object including all possible attributes
     */
    public Transfer(String pDate, double pAmount, String pDescription, String pSender, String pRecipient)
    {//Creates a new Transfer that has both a Sender and a Recipient linked to it
        super(pDate, pAmount, pDescription);
        this.setSender(pSender);
        this.setRecipient(pRecipient);
    }
    /**
     * constructs an Object of Transfer by copying an existing Object of Transfer
     */
    public Transfer(Transfer pTransfer) //Copy-Constructor
    {
        super(pTransfer.getDate(), pTransfer.getAmount(), pTransfer.getDescription());
        this.setRecipient(pTransfer.getRecipient());
        this.setSender(pTransfer.getSender());

    }


    /**
     * überschriebene setAmount() methode aus der super class
     * @param amount, ein double, welcher in (this).description geschrieben wird, wenn dieser > 0 ist.
     *                otherwise there will be an error prompted to the console and the value will remain as is
     */
    @Override
    public void setAmount(double amount)
    {//Sets the Amount linked to the Transfer

        if(amount > 0)
            this.amount = amount;
        else
        {
            System.out.println("Amount has to be a numbers above 0;");
        }
    }


    /**
     * @return gibt das Attribut sender zurück
     */
    public String getSender()
    {//Returns the Sender linked to the Transfer
        return sender;
    }

    /**
     * @param sender, ein String, welcher in (this).sender geschrieben wird
     */
    public void setSender(String sender)
    {//Sets the Sender linked to the Transfer
        this.sender = sender;
    }
    /**
     * @return gibt das Attribut recipient zurück
     */
    public String getRecipient()
    {//Returns the Recipient linked to the Transfer
        return recipient;
    }
    /**
     * @param recipient, ein String, welcher in (this).recipient geschrieben wird
     */
    public void setRecipient(String recipient)
    {//Sets the Recipient linked to the Transfer
        this.recipient = recipient;
    }

    /**
     * überschriebenes toString() aus der super class
     * @return gibt die 5 Attribute amount, date, description, sender, recipient als String zurück, amount bezieht sich hier auf einen durch calculate() berechneten Wert
     */
    @Override
    public String toString()
    {//Prints all Attributes of the Payment-Object to the Console
        return super.toString() +  " Sender:" + this.getSender() + "; " + "Recipient:" + this.getRecipient() + ";";
    }


    /**
     * Überschriebene equals()
     * @param o enhält ein Objekt o, um den Inhalt mit dem Object (this) zu vergleichen
     *              instanceof Operator prüft, ob es eine Beziehung zu Transfer hat.
     * @return true, wenn (this) und das zu vergleichendes Object (o) das gleiche Object beschreiben
     */
    @Override
    public boolean equals(Object o)
    {
        Transfer t = (Transfer) o;
        return super.equals((t)) && this.recipient.equals(t.recipient)  && this.sender.equals(t.sender);
    }

}
