public class CresantBank implements RBIBanking{
    private String accountno;
    private String passcode;
    private double balance;
    private double Interest = 6.5;
    public CresantBank(String accountno,String passcode,double balance){
        this.accountno=accountno;
        this.passcode=passcode;
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
        if(password.equals(this.passcode)){
            if(balance>money){
                   balance = balance-money;
                   return money+"has been debited";
            } else{
                return "Insufficient balance";
            }
        }
        else{
            return "Incorrect password entered";
        }
    }

    public String checkbalance(String password) {
        if(password.equals(this.passcode)){
            return this.balance + " is remaining";
        }
        else {
            return "Wrong password entered";
        }
    }

    public Double totalInterest(int time) {
         double simpleInterest = (balance*time*Interest)/100;
         return simpleInterest;
    }
}
