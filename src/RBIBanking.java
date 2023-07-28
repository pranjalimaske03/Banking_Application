public interface RBIBanking {
    public String depositmoney(int money);
    public String withdrawmoney(int money,String password);
    public String checkbalance(String password);
    public Double totalInterest(int time);
}
