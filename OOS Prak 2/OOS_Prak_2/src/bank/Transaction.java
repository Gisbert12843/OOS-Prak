package bank;

/**
 * represents a generic Transaction with a minimum of attributes
 *
 */
public class Transaction implements CalculateBill
{
    /**
     * represents the date when the Transaction occurred
     */
    protected String date;
    /**
     * represents the amount of money linked to the Transaction
     */
    protected double amount;
    /**
     * represents a custom desctiption describing the purpose and nature of the Transaction
     */
    protected String description;

    /**
     * Konstruktor für die 3 Attribute, die jeweils gesettet werden
     * @param pDate Attribut, dass ein Datum ausgeben soll, an dem die Transaktion durchgeführt wurde
     * @param pAmount Attribut, dass den Betrag ausgibt
     * @param pDescription Attribut, dass Beschreibung bzw. den Verwendungszweck angibt
     */
    public Transaction(String pDate, double pAmount, String pDescription)
    {
        this.setDate(pDate);
        this.setAmount(pAmount);
        this.setDescription(pDescription);
    }
    /**
     * Copy-Konstruktor für Transaction
     * settet alle attribute
     * @param pTransaction
     */
    public Transaction(Transaction pTransaction)
    {
        this.setDate(pTransaction.date);
        this.setAmount(pTransaction.amount);
        this.setDescription(pTransaction.description);
    }
    /**
     * @return gibt das Attribut date zurück
     */
    public String getDate()
    {//Return the Date of the Payment
        return this.date;
    }

    /**
     * @return gibt das Attribut amount zurück
     */
    public double getAmount()
    {//Return the Amount of Money to be transferred
        return this.amount;
    }

    /**
     * @return gibt das Attribut description zurück
     */
    public String getDescription()
    {//Return the custom Description of the Payment
        return this.description;
    }

    /**
     * @param date, ein String, welcher in (this).date geschrieben wird
     */
    public void setDate(String date)
    {//Sets the Date linked to the Payment
        this.date = date;
    }

    /**
     * @param amount, ein Double, welcher in (this).amount geschrieben wird
     */
    public void setAmount(double amount)
    {//Sets the Amount Money linked to the Payment
        this.amount = amount;
    }

    /**
     * @param description, ein String, welcher in (this).description geschrieben wird
     */
    public void setDescription(String description)
    {//Sets the custom Description linked to the Payment
        this.description = description;
    }

    /**
     * @return returns amount by default without any calculations
     * um den Betrag zu errechnen und zuückzugeben. (Eigentlich nicht nötig bei Transaktion(?))
     */
    @Override
    public double calculate()
    {
        return this.amount;
    }

    /**
     * überschriebenes toString() aus der Superklasse
     * @return gibt die 3 Attribute amount, date, description als String zurück, amount bezieht sich hier auf einen durch calculate() berechneten Wert
     */
    @Override
    public String toString() {
        return "Amount:" + this.calculate() + "; " + "Date:" + getDate() + "; " + "Description:" + getDescription() + ";";
    }

    /**
     * Überschriebene equals()
     * @param o erhält ein Objekt o um den Inhalt zu vergleichen
     *              instanceof Operator prüft, ob es eine Beziehung zu transaction hat.
     * @return true, wenn (this) und zu vergleichendes Object (o) das gleiche Object beschreiben
     */
    @Override
    public boolean equals(Object o)
    {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Transaction)) {
            return false;
        }

        Transaction c = (Transaction) o;

        return Double.compare(this.amount, c.amount) == 0
                && this.date.equals(c.date) && this.description.equals(c.description);
    }
}
