public class Hotel implements Payable,Classifiable{
    private String name;
    private double cost;
    private int rank;

    public Hotel(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public void setCost(double cost){
        this.cost = cost;
    }
    @Override
    public void setRank(int rank){
        this.rank = rank;
    }
    @Override
    public double getCost(){
        return this.cost;
    }
    @Override
    public int getRank(){
        return this.rank;
    }
}
