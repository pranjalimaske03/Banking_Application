import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("In which bank you want to open your account");
        System.out.println("Print 1 to create in CresantBank or 2 to create i DiamondBank");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        System.out.println("Enter password or initial deposit");
        String password = sc.next();
        Integer initialbalance = sc.nextInt();

        double account = Math.abs(Math.random()*Math.pow(10,9));
        String stringVersion  = String.valueOf(account);

        RBIBanking bankAccount;

        if(option==1){
            bankAccount= new CresantBank(stringVersion, password ,initialbalance);
        }
        else{
            bankAccount =  new DiamondBank(stringVersion,password,(double)initialbalance);
        }
        String result = bankAccount.withdrawmoney(25000,"jattewar");
        System.out.println(result);

        result = bankAccount.withdrawmoney(25000,"jattewar");
        System.out.println(result);

        result = bankAccount.depositmoney(25000);
        System.out.println(result);
        System.out.println(bankAccount.checkbalance("jattewar"));

        System.out.println(bankAccount.totalInterest(5));

    }
}