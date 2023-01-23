public class GeneralProperties {
    /*
    tip ==> ev, villa, yazlık
    fiyat
    metrekare
     */
    private String type;
    private int mSquare;
    private int numberOfRooms;
    private int numberOfHall;
    private int price;

    public GeneralProperties(String type, int mSquare, int numberOfRooms, int numberOfHall, int price) {
        this.type = type;
        this.mSquare = mSquare;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHall = numberOfHall;
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setmSquare(int mSquare) {
        this.mSquare = mSquare;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setNumberOfHall(int numberOfHall) {
        this.numberOfHall = numberOfHall;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getmSquare() {
        return mSquare;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfHall() {
        return numberOfHall;
    }

    public int getPrice() {
        return price;
    }
    public String toString(){
    return  "Konut Tipi: " + type + ", Metrekaresi: " + mSquare + ", Oda Sayısı: " + numberOfRooms +
            ", Salon Sayısı: " + numberOfHall + ", Fiyatı: " + price;
    }
}
