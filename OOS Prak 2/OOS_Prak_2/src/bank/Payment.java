package bank;

/**
 * represents a Payment which inherits from Transaction while providing the additional attributes incomingInterest and outgoingInterest
 *
 */
public class Payment extends Transaction  //Used to represent both Incoming and Outgoing Payments
{
    /**
     * represents the percentage of interest on incoming Payments in 0.x
     */
    private double incomingInterest;
    /**
     * represents the percentage of interest on outgoing Payments
     */
    private double outgoingInterest;

    ////////////////////////////////////////////////

    /**
     * constructs a Payment-Object with bare minimum attributes
     */
    public Payment(String pDate, double pAmount, String pDescription)
    {//Creates a new Payment that has no Interest linked to it
        super(pDate, pAmount, pDescription);
    }

    /**
     * constructs a full-fledged Payment-Object including all possible attributes
     */
    public Payment(String pDate, double pAmount, String pDescription, double pIncomingInterest, double pOutgoingInterest)
    {//Creates a new Payment that has an Interest linked to it

        super(pDate, pAmount, pDescription);
        this.setIncomingInterest(pIncomingInterest);
        this.setOutgoingInterest(pOutgoingInterest);
    }
    /**
     * constructs an Object of Payment by copying an existing Object of Payment
     */
    public Payment(Payment pPayment) //Copy-Constructor
    {//Creates a Copy of an already existing Payment
        super(pPayment.getDate(), pPayment.getAmount(), pPayment.getDescription());
        this.setIncomingInterest(pPayment.getIncomingInterest());
        this.setOutgoingInterest(pPayment.getOutgoingInterest());
    }


    /**
     * @return gibt das Attribut IncomingInterest zurück
     */
    public double getIncomingInterest()
    {//Return the linked Incoming-Interest-Rate of the Payment
        return this.incomingInterest;
    }
    /**
     * @return gibt das Attribut OutgoingInterest zurück
     */
    public double getOutgoingInterest()
    {//Return the linked Outgoing-Interest-Rate of the Payment
        return this.outgoingInterest;
    }

    /**
     * @param incomingInterest, ein double, welcher in (this).incomingInterest geschrieben wird
     */
    public void setIncomingInterest(double incomingInterest)
    {//Sets the linked Incoming-Interest-Rate of the Payment
        if(incomingInterest >= 0.0 && incomingInterest <= 1.0)
            this.incomingInterest = incomingInterest;
        else {
            System.out.println("Incoming-Interest has to be a number between 0 and 1.");
        }
    }
    /**
     * @param outgoingInterest, ein double, welcher in (this).outgoingInterest geschrieben wird
     */
    public void setOutgoingInterest(double outgoingInterest)
    {//Sets the linked Outgoing-Interest-Rate of the Payment
        if(outgoingInterest >= 0.0 && outgoingInterest <= 1.0)
            this.outgoingInterest = outgoingInterest;
        else {
            System.out.println("Outgoing-Interest has to be a number between 0 and 1.");
        }
    }

    /**
     * Überschriebene calculate() aus der super class
     * @return returns amount affected by either IncomingInterestrate or OutgoingInterestrate depending on the positive or negative nature of amount
     *
     */
    @Override
    public double calculate()
    {
        if(incomingInterest >0 && amount>0)
        {
            return this.amount * (1-incomingInterest);
        }
        else if( outgoingInterest > 0 && amount <0)
        {
            return this.amount * (1+outgoingInterest);
        }
        else return this.amount;
    }
    /**
     * überschriebenes toString() aus der super class
     * @return gibt die 5 Attribute amount, date, description, incominginterest, outgoinginterest als String zurück, amount bezieht sich hier auf einen durch calculate() berechneten Wert
     */
    @Override
    public String toString()
    {//Prints all Attributes of the Payment-Object to the Console
        return super.toString() +  " IncomingInterest:" + this.getIncomingInterest() + "; " + "OutgoingInterest: " + this.getOutgoingInterest() + ";";
    }


    /**
     * Überschriebene equals()
     * @param o enhält ein Objekt o, um den Inhalt mit dem Object (this) zu vergleichen
     *              instanceof Operator prüft, ob es eine Beziehung zu Payment hat.
     * @return true, wenn (this) und das zu vergleichendes Object (o) das gleiche Object beschreiben
     */
    @Override
    public boolean equals(Object o)
    {
        Payment p = (Payment) o;
        return super.equals((p)) && Double.compare(this.incomingInterest, p.incomingInterest) == 0 && Double.compare(this.outgoingInterest, p.outgoingInterest) == 0;
    }
}
