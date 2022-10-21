public class main
{
    public static void main(String[] args)
    {
        bank.Payment newPayment1 = new bank.Payment("6.9.20", 420.69, "Pay that1");
        bank.Payment newPayment2 = new bank.Payment("6.9.21", 421.69, "Pay that2", 10, 10);
        bank.Payment newPayment3 = new bank.Payment(newPayment1);
        newPayment1.printObject();
        newPayment2.printObject();
        newPayment3.printObject();

        bank.Transfer newTransfer1 = new bank.Transfer("6.9.20", 420.69, "Transfer that1");
        bank.Transfer newTransfer2 = new bank.Transfer("6.9.21", 420.69, "Transfer that1", "Me", "You");
        bank.Transfer newTransfer3 = new bank.Transfer(newTransfer1);
        newTransfer1.printObject();
        newTransfer2.printObject();
        newTransfer3.printObject();

    }
}
