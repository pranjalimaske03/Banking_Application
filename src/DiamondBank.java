public class DiamondBank implements RBIBanking{
    private String accountno;
    private String password;
    private double balance;
    private Integer minbalance=500;
    private double rateofInterest = 7.5;


    public DiamondBank(String accountno, String password, Double balance) {
        this.accountno = accountno;
        this.password = password;
        this.balance = balance;
    }
    public String depositmoney(int money) {
        if(money>0){
            balance=balance+money;
            return "Money " +money+ " has been added to your account.Total balance is "+balance;
        }
        else{
            return "no money deposited";
        }
    }

    public String withdrawmoney(int money, String password) {
        if(password.equals(this.password)){
            if(balance-minbalance>money){
                balance = balance-money;
                return money+" has been debited";
            } else{
                return " Insufficient balance";
            }
        }
        else{
            return " Incorrect password entered";
        }
    }

    public String checkbalance(String password) {
        if(password.equals(this.password)){
            return this.balance + " is remaining";
        }
        else {
            return "Wrong password entered";
        }
    }

    public Double totalInterest(int time) {
        double simpleInterest = (balance*time*rateofInterest)/100;
        return simpleInterest;
    }
}
