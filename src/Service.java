import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class Service {

    private DefaultProperties defaultProperties=new DefaultProperties();
    private List<House> houseList=defaultProperties.getHouseList();
    private List<Villa> villaList=defaultProperties.getVillaList();
    private List<SummerHouse> summerHouseList=defaultProperties.getSummerHouseList();

    public List<String> getHouses(){
        return Collections.singletonList(
                houseList.
                        stream().
                        map(House::toString).
                        collect(Collectors.joining((System.getProperty("line.separator"))))
        );
    }
    public List<String> getVillas(){
        return Collections.singletonList
                (villaList.
                        stream().
                        map(Villa::toString).
                        collect(Collectors.joining((System.getProperty("line.separator"))))
                );
    }
    public List<String> getSummerHouses(){
        return Collections.singletonList
                (summerHouseList.
                        stream().
                        map(SummerHouse::toString).
                        collect(Collectors.joining((System.getProperty("line.separator"))))
                );
    }

    public int getTotalPricesOfHouses(){

         return houseList.stream().mapToInt(GeneralProperties::getPrice).sum();
   }
    public int getTotalPricesOfVillas(){
        int totalPrice=0;
        for (Villa villa: villaList)
            totalPrice+=villa.getPrice();
        return totalPrice;
    }
    public int getTotalPricesOfSummerHouses(){
        int totalPrice=0;
        for (SummerHouse summerHouse: summerHouseList)
            totalPrice+=summerHouse.getPrice();
        return totalPrice;
    }
    public int getTotalPriceOfAll(){
        return  getTotalPricesOfHouses()+
                getTotalPricesOfVillas()+
                getTotalPricesOfSummerHouses();
    }
    public double getAvgMsquareOfHouses(){
        int totalMsquares=0;
        for (House house:houseList) {
            totalMsquares+= house.getmSquare();
        }
        double avg= totalMsquares/houseList.size();
        return avg;
    }
    public double getAvgMsquareOfVillas(){
        int totalMsquares=0;
        for (Villa villa:villaList) {
            totalMsquares+= villa.getmSquare();
        }
       double avg= totalMsquares/villaList.size();
        return avg;
    }
    public double getAvgMsquareOfSummerHouses(){
        int totalMsquares=0;
        for (SummerHouse summerHouse:summerHouseList) {
            totalMsquares+= summerHouse.getmSquare();
        }
        double avg= totalMsquares/summerHouseList.size();
        return avg;
    }
    public double getAvgMsquaresOfAll(){
        double avgOfAllMsquares, totalMsquares;
            totalMsquares = getAvgMsquareOfHouses()+getAvgMsquareOfVillas()+getAvgMsquareOfSummerHouses();
            avgOfAllMsquares = totalMsquares/ (houseList.size()+villaList.size()+summerHouseList.size());
        return avgOfAllMsquares;

 }



}
