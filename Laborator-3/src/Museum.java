public class Museum implements Visitable,Payable,Classifiable{
    private String name;
    private double cost;
    private int rank;
    private int time;

    public Museum(String name){
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
