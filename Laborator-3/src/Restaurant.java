public class Restaurant implements Visitable,Payable,Classifiable{
    private String name;
    private int time;
    private double cost;
    private int rank;

    public Restaurant(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public void setTime(int time){
        this.time = time;
    }
    @Override
    public int getTime(){
        return this.time;
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
