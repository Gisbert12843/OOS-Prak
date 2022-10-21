public class bank
{
    public static class Payment //Used to represent both Incoming and Outgoing Payments
    {
        private String date;
        private double amount;
        private String description;
        private double incomingInterest;
        private double outgoingInterest;

        ////////////////////////////////////////////////

        public Payment(String pDate, double pAmount, String pDescription)
        {//Creates a new Payment that has no Interest linked to it
            this.setDate(pDate);
            this.setAmount(pAmount);
            this.setDescription(pDescription);
        }

        public Payment(String pDate, double pAmount, String pDescription, double pIncomingInterest, double pOutgoingInterest)
        {//Creates a new Payment that has an Interest linked to it
            this.setDate(pDate);
            this.setAmount(pAmount);
            this.setDescription(pDescription);
            this.setIncomingInterest(pIncomingInterest);
            this.setOutgoingInterest(pOutgoingInterest);
        }

        public Payment(Payment pPayment) //Copy-Constructor
        {//Creates a Copy of an already existing Payment
            this.setIncomingInterest(pPayment.getIncomingInterest());
            this.setOutgoingInterest(pPayment.getOutgoingInterest());
            this.setDescription(pPayment.getDescription());
            this.setDate(pPayment.getDate());
            this.setAmount(pPayment.getAmount());
        }

        public String getDate()
        {//Return the Date of the Payment
            return this.date;
        }

        public double getAmount()
        {//Return the Amount of Money to be transferred
            return this.amount;
        }

        public String getDescription()
        {//Return the custom Description of the Payment
            return this.description;
        }

        public double getIncomingInterest()
        {//Return the linked Incoming-Interest-Rate of the Payment
            return this.incomingInterest;
        }

        public double getOutgoingInterest()
        {//Return the linked Outgoing-Interest-Rate of the Payment
            return this.outgoingInterest;
        }

        public void setDate(String date)
        {//Sets the Date linked to the Payment
            this.date = date;
        }

        public void setAmount(double amount)
        {//Sets the Amount Money linked to the Payment
            this.amount = amount;
        }

        public void setDescription(String description)
        {//Sets the custom Description linked to the Payment
            this.description = description;
        }

        public void setIncomingInterest(double incomingInterest)
        {//Sets the linked Incoming-Interest-Rate of the Payment
            this.incomingInterest = incomingInterest;
        }

        public void setOutgoingInterest(double outgoingInterest)
        {//Sets the linked Outgoing-Interest-Rate of the Payment
            this.outgoingInterest = outgoingInterest;
        }

        public void printObject()
        {//Prints all Attributes of the Payment-Object to the Console
            System.out.println(getAmount() + ";" + getDate() + ";" + getDescription() + ";" + getIncomingInterest() + ";" + getOutgoingInterest() + ";\n");
        }
    }

    public static class Transfer //Used to represent a Bank-Transfer
    {
        private String date;
        private double amount;
        private String description;
        String sender;
        String recipient;

        ////////////////////////////////////////////////
        public Transfer(String pDate, double pAmount, String pDescription)
        {//Creates a new Payment that has no Sender or Recipient linked to it
            this.setDate(pDate);
            this.setAmount(pAmount);
            this.setDescription(pDescription);
        }

        public Transfer(String pDate, double pAmount, String pDescription, String pSender, String pRecipient)
        {//Creates a new Transfer that has both a Sender and a Recipient linked to it
            this.setDate(pDate);
            this.setAmount(pAmount);
            this.setDescription(pDescription);
            this.setSender(pSender);
            this.setRecipient(pRecipient);
        }

        public Transfer(Transfer pTransfer) //Copy-Constructor
        {//Creates a Copy of an already existing Transfer
            this.setRecipient(pTransfer.getRecipient());
            this.setSender(pTransfer.getSender());
            this.setDescription(pTransfer.getDescription());
            this.setDate(pTransfer.getDate());
            this.setAmount(pTransfer.getAmount());
        }

        public void printObject()
        {//Prints all Attributes of the Transfer-Object to the Console
            System.out.println(getAmount() + ";" + getDate() + ";" + getDescription() + ";" + getSender() + ";" + getRecipient() + ";\n");
        }

        public String getDate()
        {//Return the Date linked to the Transfer
            return date;
        }

        public void setDate(String date)
        {//Sets the Date linked to the Transfer
            this.date = date;
        }

        public double getAmount()
        {//Returns the Amount linked to the Transfer
            return amount;
        }

        public void setAmount(double amount)
        {//Sets the Amount linked to the Transfer
            this.amount = amount;
        }

        public String getDescription()
        {//Returns the Description linked to the Transfer
            return description;
        }

        public void setDescription(String description)
        {//Sets the Description linked to the Transfer
            this.description = description;
        }

        public String getSender()
        {//Returns the Sender linked to the Transfer
            return sender;
        }

        public void setSender(String sender)
        {//Sets the Sender linked to the Transfer
            this.sender = sender;
        }

        public String getRecipient()
        {//Returns the Recipient linked to the Transfer
            return recipient;
        }

        public void setRecipient(String recipient)
        {//Sets the Recipient linked to the Transfer
            this.recipient = recipient;
        }
    }
}
