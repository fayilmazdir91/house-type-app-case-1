import java.util.ArrayList;
import java.util.List;

public class PropertyService {
	
	private ArrayList<House> houses;
    private ArrayList<Villa> villas;
    private ArrayList<SummerHouse> summerHouses;
	
    public PropertyService() {
        houses = new ArrayList<>();
        villas = new ArrayList<>();
        summerHouses = new ArrayList<>();
        
        houses.add(new House(30, 50000, 3, 1));
        houses.add(new House(40, 70000, 2, 1));
        houses.add(new House(25, 30000, 2, 1));

        villas.add(new Villa(30, 50000, 3, 1));
        villas.add(new Villa(40, 70000, 4, 1));
        villas.add(new Villa(25, 30000, 2, 1));

        summerHouses.add(new SummerHouse(30, 50000, 3, 1));
        summerHouses.add(new SummerHouse(40, 70000, 4, 1));
        summerHouses.add(new SummerHouse(25, 30000, 2, 1));

    }
    
    public ArrayList<House> getHouseList() {
    	return houses;
    }
    
    public ArrayList<Villa> getVillaList() {
    	return villas;
    }
    
    public ArrayList<SummerHouse> getSummerHouseList() {
    	return summerHouses;
    }
    
    public int housePriceSum() {
    	int sum = 0;
    	
    	for(House house : houses) {
    		sum += house.getPrice();
    	}
    	
    	return sum;
    }
    
    public int villaPriceSum() {
    	int sum = 0;
    	
    	for(Villa villa : villas) {
    		sum += villa.getPrice();
    	}
    	
    	return sum;
    }
    
    public int summerHousePriceSum() {
    	int sum = 0;
    	
    	for(SummerHouse summerHouse: summerHouses) {
    		sum += summerHouse.getPrice();
    	}
    	
    	return sum;
    }
    
    public int propertyPriceSum() {
    	int sum = 0;
    	
    	for(House house : houses) {
    		sum += house.getPrice();
    	}
    	
    	for(Villa villa : villas) {
    		sum += villa.getPrice();
    	}
    	
    	for(SummerHouse summerHouse: summerHouses) {
    		sum += summerHouse.getPrice();
    	}
    	
    	return sum;
    }
    
    public int houseAreaAvg() {
    	int sum = 0;
    	
    	for(House house : houses) {
    		sum += house.getArea();
    	}
    	
    	return sum/houses.size();
    }
    
    public int villaAreaAvg() {
    	int sum = 0;
    	
    	for(Villa villa : villas) {
    		sum += villa.getArea();
    	}
    	
    	return sum/villas.size();
    }
    
    public int summerHouseAreaAvg() {
    	int sum = 0;
    	
    	for(SummerHouse summerHouse : summerHouses) {
    		sum += summerHouse.getArea();
    	}
    	
    	return sum/summerHouses.size();
    }
    
    public int propertyAreaAvg() {
    	int sum = 0;
    	
    	for(House house : houses) {
    		sum += house.getArea();
    	}
    	
    	for(Villa villa : villas) {
    		sum += villa.getArea();
    	}
    	
    	for(SummerHouse summerHouse : summerHouses) {
    		sum += summerHouse.getArea();
    	}
    	
    	int allProperties = houses.size() + villas.size() + summerHouses.size();
    	
    	return sum/allProperties;
    }
    
    public String filterPropertiesByRoomsAndLivingRooms(int numberOfRooms, int numberOfLivingRooms) {
    	List<Property> filteredProperties = new ArrayList<>();
    	
    	for (House house: houses) {
    		if(numberOfRooms == house.getRoomCount() && numberOfLivingRooms == house.getLivingRoomCount()) {
    			filteredProperties.add(house);
    		}
    	}
    	
    	for (Villa villa: villas) {
    		if(numberOfRooms == villa.getRoomCount() && numberOfLivingRooms == villa.getLivingRoomCount()) {
    			filteredProperties.add(villa);
    		}
    	}
    	
    	for (SummerHouse summerHouse: summerHouses) {
    		if(numberOfRooms == summerHouse.getRoomCount() && numberOfLivingRooms == summerHouse.getLivingRoomCount()) {
    			filteredProperties.add(summerHouse);
    		}
    	}
    	
    	return filteredProperties.toString();
    }
}
