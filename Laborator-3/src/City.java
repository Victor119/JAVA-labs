import java.util.*;

public class City {
    private List<Hotel> hotel;
    private List<Museum> museum;
    private List<Church> church;
    private List<Restaurant> restaurant;

    private Map<Hotel, ArrayList<Integer>> hotelMuseumMap1;
    private Map<Integer, Museum> hotelMuseumMap2;
    private ArrayList<Integer> itemList1;
    private Map<Hotel, ArrayList<Integer>> hotelChurchMap1;
    private Map<Integer, Church> hotelChurchMap2;
    private ArrayList<Integer> itemList2;
    private Map<Hotel, ArrayList<Integer>> hotelRestaurantMap1;
    private Map<Integer, Restaurant> hotelRestaurantMap2;
    private ArrayList<Integer> itemList3;

    private Map<Museum, ArrayList<Integer>> museumHotelMap1;
    private Map<Integer, Hotel> museumHotelMap2;
    private ArrayList<Integer> itemList4;
    private Map<Museum, ArrayList<Integer>> museumChurchMap1;
    private Map<Integer, Church> museumChurchMap2;
    private ArrayList<Integer> itemList5;
    private Map<Museum, ArrayList<Integer>> museumRestaurantMap1;
    private Map<Integer, Restaurant> museumRestaurantMap2;
    private ArrayList<Integer> itemList6;

    private Map<Church, ArrayList<Integer>> churchHotelMap1;
    private Map<Integer, Hotel> churchHotelMap2;
    private ArrayList<Integer> itemList7;
    private Map<Church, ArrayList<Integer>> churchMuseumMap1;
    private Map<Integer, Museum> churchMuseumMap2;
    private ArrayList<Integer> itemList8;
    private Map<Church, ArrayList<Integer>> churchRestaurantMap1;
    private Map<Integer, Restaurant> churchRestaurantMap2;
    private ArrayList<Integer> itemList9;

    private Map<Restaurant, ArrayList<Integer>> restaurantHotelMap1;
    private Map<Integer, Hotel> restaurantHotelMap2;
    private ArrayList<Integer> itemList10;
    private Map<Restaurant, ArrayList<Integer>> restaurantMuseumMap1;
    private Map<Integer, Museum> restaurantMuseumMap2;
    private ArrayList<Integer> itemList11;
    private Map<Restaurant, ArrayList<Integer>> restaurantChurchMap1;
    private Map<Integer, Church> restaurantChurchMap2;
    private ArrayList<Integer> itemList12;

    public City(){
        this.hotel = new ArrayList<Hotel>();
        this.museum = new ArrayList<Museum>();
        this.church = new ArrayList<Church>();
        this.restaurant = new ArrayList<Restaurant>();
        this.hotelMuseumMap1 = new HashMap<Hotel, ArrayList<Integer>>();
        this.hotelMuseumMap2 = new HashMap<Integer, Museum>();
        this.itemList1 = new ArrayList<Integer>();
        this.hotelChurchMap1 = new HashMap<Hotel, ArrayList<Integer>>();
        this.hotelChurchMap2 = new HashMap<Integer, Church>();
        this.itemList2 = new ArrayList<Integer>();
        this.hotelRestaurantMap1 = new HashMap<Hotel, ArrayList<Integer>>();
        this.hotelRestaurantMap2 = new HashMap<Integer, Restaurant>();
        this.itemList3 = new ArrayList<Integer>();

        this.museumHotelMap1 = new HashMap<Museum, ArrayList<Integer>>();
        this.museumHotelMap2 = new HashMap<Integer, Hotel>();
        this.itemList4 = new ArrayList<Integer>();
        this.museumChurchMap1 = new HashMap<Museum, ArrayList<Integer>>();
        this.museumChurchMap2 = new HashMap<Integer, Church>();
        this.itemList5 = new ArrayList<Integer>();
        this.museumRestaurantMap1 = new HashMap<Museum, ArrayList<Integer>>();
        this.museumRestaurantMap2 = new HashMap<Integer, Restaurant>();
        this.itemList6 = new ArrayList<Integer>();

        this.churchHotelMap1 = new HashMap<Church, ArrayList<Integer>>();
        this.churchHotelMap2 = new HashMap<Integer, Hotel>();
        this.itemList7 = new ArrayList<Integer>();
        this.churchMuseumMap1 = new HashMap<Church, ArrayList<Integer>>();
        this.churchMuseumMap2 = new HashMap<Integer, Museum>();
        this.itemList8 = new ArrayList<Integer>();
        this.churchRestaurantMap1 = new HashMap<Church, ArrayList<Integer>>();
        this.churchRestaurantMap2 = new HashMap<Integer, Restaurant>();
        this.itemList9 = new ArrayList<Integer>();

        this.restaurantHotelMap1 = new HashMap<Restaurant, ArrayList<Integer>>();
        this.restaurantHotelMap2 = new HashMap<Integer, Hotel>();
        this.itemList10 = new ArrayList<Integer>();
        this.restaurantMuseumMap1 = new HashMap<Restaurant, ArrayList<Integer>>();
        this.restaurantMuseumMap2 = new HashMap<Integer, Museum>();
        this.itemList11 = new ArrayList<Integer>();
        this.restaurantChurchMap1 = new HashMap<Restaurant, ArrayList<Integer>>();
        this.restaurantChurchMap2 = new HashMap<Integer, Church>();
        this.itemList12 = new ArrayList<Integer>();
    }

    public void addHourHotelToMuseum(Hotel hotel, Museum museum, int minute){
        this.itemList1.add(minute);
        this.hotelMuseumMap1.put(hotel, itemList1);
        this.hotelMuseumMap2.put(minute, museum);
    }
    public void addHourHotelToChurch(Hotel hotel, Church church, int minute){
        this.itemList2.add(minute);
        this.hotelChurchMap1.put(hotel, itemList2);
        this.hotelChurchMap2.put(minute, church);
    }
    public void addHourHotelToRestaurant(Hotel hotel, Restaurant restaurant, int minute){
        this.itemList3.add(minute);
        this.hotelRestaurantMap1.put(hotel, itemList3);
        this.hotelRestaurantMap2.put(minute, restaurant);
    }
    public void addHourMuseumToHotel(Museum museum, Hotel hotel, int minute){
        this.itemList4.add(minute);
        this.museumHotelMap1.put(museum, itemList4);
        this.museumHotelMap2.put(minute, hotel);
    }
    public void addHourMuseumToChurch(Museum museum, Church church, int minute){
        this.itemList5.add(minute);
        this.museumChurchMap1.put(museum, itemList5);
        this.museumChurchMap2.put(minute, church);
    }
    public void addHourMuseumToRestaurant(Museum museum, Restaurant restaurant, int minute){
        this.itemList6.add(minute);
        this.museumRestaurantMap1.put(museum, itemList6);
        this.museumRestaurantMap2.put(minute, restaurant);
    }
    public void addHourChurchToHotel(Church church, Hotel hotel, int minute){
        this.itemList7.add(minute);
        this.churchHotelMap1.put(church, itemList7);
        this.churchHotelMap2.put(minute, hotel);
    }
    public void addHourChurchToMuseum(Church church, Museum museum, int minute){
        this.itemList8.add(minute);
        this.churchMuseumMap1.put(church, itemList8);
        this.churchMuseumMap2.put(minute, museum);
    }
    public void addHourChurchToRestaurant(Church church, Restaurant restaurant, int minute){
        this.itemList9.add(minute);
        this.churchRestaurantMap1.put(church, itemList9);
        this.churchRestaurantMap2.put(minute, restaurant);
    }
    public void addHourRestaurantToMuseum(Restaurant restaurant, Museum museum, int minute){
        this.itemList10.add(minute);
        this.restaurantMuseumMap1.put(restaurant, itemList10);
        this.restaurantMuseumMap2.put(minute, museum);
    }
    public void addHourRestaurantToChurch(Restaurant restaurant, Church church, int minute){
        this.itemList11.add(minute);
        this.restaurantChurchMap1.put(restaurant, itemList11);
        this.restaurantChurchMap2.put(minute, church);
    }
    public void addHourRestaurantToHotel(Restaurant restaurant, Hotel hotel, int minute){
        this.itemList12.add(minute);
        this.restaurantHotelMap1.put(restaurant, itemList12);
        this.restaurantHotelMap2.put(minute, hotel);
    }
    public void printHotelToMuseum(){
        for(Hotel key : hotelMuseumMap1.keySet()){
            for(int k=0; k < hotelMuseumMap1.get(key).size(); k++)
            {
                for(Integer key2 : hotelMuseumMap2.keySet()){
                        if(key2.equals(hotelMuseumMap1.get(key).get(k)))
                            System.out.println("Drumul de la " + key.getName() + " catre " + hotelMuseumMap2.get(key2).getName() + " dureaza " + hotelMuseumMap1.get(key).get(k) + " minute");
                }
            }
        }
    }
    public void printHotelToChurch(){
        for(Hotel key : hotelChurchMap1.keySet()){
            for(int k=0; k < hotelChurchMap1.get(key).size(); k++)
            {
                for(Integer key2 : hotelChurchMap2.keySet()){
                    if(key2.equals(hotelChurchMap1.get(key).get(k)))
                        System.out.println("Drumul de la " + key.getName() + " catre " + hotelChurchMap2.get(key2).getName() + " dureaza " + hotelChurchMap1.get(key).get(k) + " minute");
                }
            }
        }
    }
    public void printHotelToRestaurant(){
        for(Hotel key : hotelRestaurantMap1.keySet()){
            for(int k=0; k < hotelRestaurantMap1.get(key).size(); k++)
            {
                for(Integer key2 : hotelRestaurantMap2.keySet()){
                    if(key2.equals(hotelRestaurantMap1.get(key).get(k)))
                        System.out.println("Drumul de la " + key.getName() + " catre " + hotelRestaurantMap2.get(key2).getName() + " dureaza " + hotelRestaurantMap1.get(key).get(k) + " minute");
                }
            }
        }
    }

    public void printMuseumToHotel(){
        for(Museum key : museumHotelMap1.keySet()){
            for(int k=0; k < museumHotelMap1.get(key).size(); k++)
            {
                for(Integer key2 : museumHotelMap2.keySet()){
                    if(key2.equals(museumHotelMap1.get(key).get(k)))
                        System.out.println("Drumul de la " + key.getName() + " catre " + museumHotelMap2.get(key2).getName() + " dureaza " + museumHotelMap1.get(key).get(k) + " minute");
                }
            }
        }
    }
    public void printMuseumToChurch(){
        for(Museum key : museumChurchMap1.keySet()){
            for(int k=0; k < museumChurchMap1.get(key).size(); k++)
            {
                for(Integer key2 : museumChurchMap2.keySet()){
                    if(key2.equals(museumChurchMap1.get(key).get(k)))
                        System.out.println("Drumul de la " + key.getName() + " catre " + museumChurchMap2.get(key2).getName() + " dureaza " + museumChurchMap1.get(key).get(k) + " minute");
                }
            }
        }
    }
    public void printMuseumToRestaurant(){
        for(Museum key : museumRestaurantMap1.keySet()){
            for(int k=0; k < museumRestaurantMap1.get(key).size(); k++)
            {
                for(Integer key2 : museumRestaurantMap2.keySet()){
                    if(key2.equals(museumRestaurantMap1.get(key).get(k)))
                        System.out.println("Drumul de la " + key.getName() + " catre " + museumRestaurantMap2.get(key2).getName() + " dureaza " + museumRestaurantMap1.get(key).get(k) + " minute");
                }
            }
        }
    }

    public void printChurchToMuseum(){
        for(Church key : churchMuseumMap1.keySet()){
            for(int k=0; k < churchMuseumMap1.get(key).size(); k++)
            {
                for(Integer key2 : churchMuseumMap2.keySet()){
                    if(key2.equals(churchMuseumMap1.get(key).get(k)))
                        System.out.println("Drumul de la " + key.getName() + " catre " + churchMuseumMap2.get(key2).getName() + " dureaza " + churchMuseumMap1.get(key).get(k) + " minute");
                }
            }
        }
    }
    public void printChurchToHotel(){
        for(Church key : churchHotelMap1.keySet()){
            for(int k=0; k < churchHotelMap1.get(key).size(); k++)
            {
                for(Integer key2 : churchHotelMap2.keySet()){
                    if(key2.equals(churchHotelMap1.get(key).get(k)))
                        System.out.println("Drumul de la " + key.getName() + " catre " + churchHotelMap2.get(key2).getName() + " dureaza " + churchHotelMap1.get(key).get(k) + " minute");
                }
            }
        }
    }
    public void printChurchToRestaurant(){
        for(Church key : churchRestaurantMap1.keySet()){
            for(int k=0; k < churchRestaurantMap1.get(key).size(); k++)
            {
                for(Integer key2 : churchRestaurantMap2.keySet()){
                    if(key2.equals(churchRestaurantMap1.get(key).get(k)))
                        System.out.println("Drumul de la " + key.getName() + " catre " + churchRestaurantMap2.get(key2).getName() + " dureaza " + churchRestaurantMap1.get(key).get(k) + " minute");
                }
            }
        }
    }

    public void printRestaurantToMuseum(){
        for(Restaurant key : restaurantMuseumMap1.keySet()){
            for(int k=0; k < restaurantMuseumMap1.get(key).size(); k++)
            {
                for(Integer key2 : restaurantMuseumMap2.keySet()){
                    if(key2.equals(restaurantMuseumMap1.get(key).get(k)))
                        System.out.println("Drumul de la " + key.getName() + " catre " + restaurantMuseumMap2.get(key2).getName() + " dureaza " + restaurantMuseumMap1.get(key).get(k) + " minute");
                }
            }
        }
    }
    public void printRestaurantToChurch(){
        for(Restaurant key : restaurantChurchMap1.keySet()){
            for(int k=0; k < restaurantChurchMap1.get(key).size(); k++)
            {
                for(Integer key2 : restaurantChurchMap2.keySet()){
                    if(key2.equals(restaurantChurchMap1.get(key).get(k)))
                        System.out.println("Drumul de la " + key.getName() + " catre " + restaurantChurchMap2.get(key2).getName() + " dureaza " + restaurantChurchMap1.get(key).get(k) + " minute");
                }
            }
        }
    }
    public void printRestaurantToHotel(){
        for(Restaurant key : restaurantHotelMap1.keySet()){
            for(int k=0; k < restaurantHotelMap1.get(key).size(); k++)
            {
                for(Integer key2 : restaurantHotelMap2.keySet()){
                    if(key2.equals(restaurantHotelMap1.get(key).get(k)))
                        System.out.println("Drumul de la " + key.getName() + " catre " + restaurantHotelMap2.get(key2).getName() + " dureaza " + restaurantHotelMap1.get(key).get(k) + " minute");
                }
            }
        }
    }

    public void addHotels(Hotel hotels){
        this.hotel.add(hotels);
    }
    public void addMuseums(Museum museums){
        this.museum.add(museums);
    }
    public void addChurches(Church churches){
        this.church.add(churches);
    }
    public void addRestaurants(Restaurant restaurants){
        this.restaurant.add(restaurants);
    }
    public void printHotels(){
        for(int i = 0; i< hotel.size(); i++){
            System.out.println(hotel.get(i).getName());
        }
    }
    public void printMuseums(){
        for(int i = 0; i< museum.size(); i++){
            System.out.println(museum.get(i).getName());
        }
    }
    public void printChurches(){
        for(int i = 0; i< church.size(); i++){
            System.out.println(church.get(i).getName());
        }
    }
    public void printRestaurants(){
        for(int i = 0; i< restaurant.size(); i++){
            System.out.println(restaurant.get(i).getName());
        }
    }
}
