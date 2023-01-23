package Model;

public class Villa extends GeneralProperties {
    public Villa(String type, int mSquare, int numberOfRooms, int numberOfHall,int price) {
        super(type, mSquare, numberOfRooms, numberOfHall,price);
    }

    public String toString(){
        return super.toString();
    }

}
