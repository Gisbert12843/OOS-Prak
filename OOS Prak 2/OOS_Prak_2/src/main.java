
import bank.Payment;
import bank.Transfer;

public class main
{
    public static void main(String[] args)
    {
        bank.Payment newPayment1 = new bank.Payment("6.9.20", 420.69, "Pay that1");
        bank.Payment newPayment2 = new bank.Payment("6.9.21", 1000, "Pay that2", 0.05, 0.1);
        bank.Payment newPayment3 = new bank.Payment("6.9.21", -1000, "Pay that3", 0.05, 0.1);
        bank.Payment newPayment4 = new bank.Payment(newPayment1);
        bank.Payment copyof_newPayment1 = newPayment1;


        bank.Transfer newTransfer1 = new bank.Transfer("6.9.20", 420.69, "Transfer that1");
        bank.Transfer newTransfer2 = new bank.Transfer("6.9.21", 420.69, "Transfer that2", "Me", "You");
        bank.Transfer newTransfer3 = new bank.Transfer(newTransfer1);

        if(newPayment1.equals(copyof_newPayment1)) System.out.println("\nEQUALS WORKS!\n");
        if(newPayment2.equals(copyof_newPayment1)) System.out.println("\nEQUALS DOESN'T WORK :(\n");


        System.out.println(newPayment1);
        System.out.println(newPayment2);
        System.out.println(newPayment3);
        System.out.println(newTransfer1);
        System.out.println(newTransfer2);
        System.out.println(newTransfer3);

    }
}
