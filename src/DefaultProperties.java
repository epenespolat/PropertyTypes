import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class DefaultProperties {
    private List<House> houseList = new ArrayList<>();
    private List<Villa> villaList= new ArrayList<>();
    private List<SummerHouse> summerHouseList= new ArrayList<>();
    private House h1= new House("Ev",120,3,1,2123123);
    private House h2= new House("Ev",100,2,1,3123132);
    private House h3= new House("Ev",110,2,1,4123123);
    private Villa v1= new Villa("Villa",312,3,2,624124);
    private Villa v2= new Villa("Villa",412,4,2,824124);
    private Villa v3= new Villa("Villa",542,5,2,924124);
    private SummerHouse s1= new SummerHouse("SummerHouse",123,2,1,134412);
    private SummerHouse s2= new SummerHouse("SummerHouse",111,2,1,144445);
    private SummerHouse s3= new SummerHouse("SummerHouse",143,3,1,234412);

    public List<House> getHouseList(){
        houseList.addAll(Arrays.asList(h1, h2, h3));
        return houseList;
    }
    public List<Villa> getVillaList(){
        villaList.addAll(Arrays.asList(v1, v2, v3));
        return villaList;
    }
    public List<SummerHouse> getSummerHouseList(){
        summerHouseList.addAll(Arrays.asList(s1, s2, s3));
        return summerHouseList;
    }
}
