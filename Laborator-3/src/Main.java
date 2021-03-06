public class Main {
    public static void main(String[] args) {
        City city = new City();
        Hotel hotel = new Hotel("Hotel");
        Museum museumA = new Museum("Museum A");
        Museum museumB = new Museum("Museum B");
        Church churchA = new Church("Church A");
        Church churchB = new Church("Church B");
        Restaurant restaurant = new Restaurant("Restaurant");
        city.addHotels(hotel);
        city.addMuseums(museumA);
        city.addMuseums(museumB);
        city.addChurches(churchA);
        city.addChurches(churchB);
        city.addRestaurants(restaurant);
        city.printHotels();
        city.printMuseums();
        city.printChurches();
        city.printRestaurants();

        city.addHourHotelToMuseum(hotel, museumA, 5);
        city.addHourHotelToMuseum(hotel, museumB, 10);
        city.addHourHotelToChurch(hotel, churchA, 15);
        city.addHourHotelToChurch(hotel, churchB, 20);
        city.addHourHotelToRestaurant(hotel, restaurant, 25);
        city.printHotelToMuseum();
        city.printHotelToChurch();
        city.printHotelToRestaurant();

        city.addHourMuseumToHotel(museumA, hotel,1);
        city.addHourMuseumToChurch(museumB, churchB,6);
        city.addHourMuseumToRestaurant(museumA, restaurant, 7);
        city.printMuseumToHotel();
        city.printMuseumToChurch();
        city.printMuseumToRestaurant();

        city.addHourChurchToHotel(churchA, hotel,2);
        city.addHourChurchToMuseum(churchB, museumB,8);
        city.addHourChurchToRestaurant(churchA, restaurant, 9);
        city.printChurchToHotel();
        city.printChurchToMuseum();
        city.printChurchToRestaurant();

        city.addHourRestaurantToMuseum(restaurant, museumA, 11);
        city.addHourRestaurantToMuseum(restaurant, museumB, 22);
        city.addHourRestaurantToChurch(restaurant, churchA, 33);
        city.addHourRestaurantToChurch(restaurant, churchB, 44);
        city.addHourRestaurantToHotel(restaurant, hotel, 55);
        city.printRestaurantToMuseum();
        city.printRestaurantToChurch();
        city.printRestaurantToHotel();
    }
}
