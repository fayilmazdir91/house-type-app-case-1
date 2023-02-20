
public class Main {

	public static void main(String[] args) {
		PropertyService propertyService = new PropertyService();
		
		System.out.println("--- PRICES ---");
		System.out.println("Total price of all Houses = " + propertyService.housePriceSum());
		System.out.println("Total price of all Villas = " + propertyService.villaPriceSum());
		System.out.println("Total price of all SummerHouses = " + propertyService.summerHousePriceSum());
		System.out.println("Total price of all Properties = " + propertyService.propertyPriceSum());
		System.out.println("--- AVERAGE SQUARE METERS ---");
		System.out.println("Average square meter of Houses = " + propertyService.houseAreaAvg());
		System.out.println("Average square meter of Villas = " + propertyService.villaAreaAvg());
		System.out.println("Average square meter of SummerHouses = " + propertyService.summerHouseAreaAvg());
		System.out.println("Average square meter of Properties = " + propertyService.propertyAreaAvg());
		System.out.println("--- FILTERED PROPERTIES ---");
		System.out.println("Properties with 2 Rooms and 1 Living Rooms = " + propertyService.filterPropertiesByRoomsAndLivingRooms(2, 1));
	}

}
