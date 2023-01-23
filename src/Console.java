import java.util.Scanner;

public class Console {

    public void run() {
        Service service = new Service();
        Scanner input = new Scanner(System.in);
        boolean loginCheck=true;
        System.out.println("1- Login\n2- Çıkış");
        int login = input.nextInt();
        if (login==1){
            loginCheck= true;
        } else{
            loginCheck=false;
        };
       while(loginCheck==true){

           System.out.println("##############################################################");
        System.out.println("                PTK Emlak, Hoşgeldiniz!!\n\n ");
        System.out.println("##############################################################");
        System.out.println("Ana Menü ");
        System.out.println("_______________________________________________________________");
        System.out.println("Lütfen aşağıdaki operasyonlardan birini seçiniz: ");
        System.out.println("1- Evlerin Listesi\n2- Vilların Listesi\n3- Yazlıkların Listesi\n4- Diğer İşlemler\n5- Çıkış.");

        int opSelection = input.nextInt();


        if (opSelection == 1){
            System.out.println(service.getHouses());
            System.out.println("1- Evlerin Toplam Fiyatını Görmek İstiyorum\n2- Evlerin Ortalama Metrekaresini Görmek İstiyorum!\n");
            int housePrice = input.nextInt();
            if (housePrice==1){
                System.out.println("Evlerin toplam fiyatı:"+service.getTotalPricesOfHouses()+ " ₺");
            } else if (housePrice==2) {
                System.out.println("Evlerin ortalama metrekaresi: "+service.getAvgMsquareOfHouses()+ " m2");
            }else {
                System.out.println("Lütfen geçerli bir değer giriniz!");
                break;
            }

        } else if (opSelection ==2) {
            System.out.println(service.getVillas());
            System.out.println("1- Villaların Toplam Fiyatını Görmek İstiyorum\n2- Villaların Ortalam Metrekaresini Görmek İstiyorum!\n");
            int villaPrice = input.nextInt();
            if (villaPrice==1){
                System.out.println("Villaların toplam fiyatı: "+service.getTotalPricesOfVillas() +" ₺");
            } else if (villaPrice==2) {
                System.out.println("Villaların ortalama metrekaresi: "+service.getAvgMsquareOfVillas()+" m2");
            }else {
                System.out.println("Lütfen geçerli bir değer giriniz!");
                break;
            }
        } else if (opSelection==3) {
            System.out.println(service.getSummerHouses());
            System.out.println("1- Yazlıkların Toplam Fiyatını Görmek İstiyorum\n2- Yazlıkların Ortalama Metrekaresini Görmek İstiyorum!\n");
            int sHPrice = input.nextInt();
            if (sHPrice==1){
                System.out.println("Yazlıkların toplam fiyatı: "+service.getTotalPricesOfHouses() + " ₺");
            } else if (sHPrice==2) {
                System.out.println("Yazlıkların ortalama metrekaresi: "+service.getAvgMsquareOfHouses()+ " m2");
            }else {
                System.out.println("Lütfen geçerli bir değer giriniz!");
                break;
            }

        } else if (opSelection==4) {
            System.out.println( "1- Tüm konutların toplam fiyatını görmek istiyorum.\n2- Evlerin ortalama metrekaresini görmek istiyorum." +
                                "\n3- Villaların ortalama metrekaresini görmek istiyorum.\n"+
                                "4- Yazlıkların ortalama metrekaresini görmek istiyorum." +
                                "\n5- Tüm tipteki konutların ortalama metrekaresini görmek istiyorum.\n" +
                                "6- Oda ve Salon sayısına göre filtrele\n");
            int otherOpt= input.nextInt();
            if (otherOpt==1){
                System.out.println("Tüm konutların toplam fiyatı: "+service.getTotalPriceOfAll()+" ₺");
            } else if (otherOpt==2) {
                System.out.println("Evlerin ortalama metrekaresi: "+service.getAvgMsquareOfHouses()+" m2");
            }else if (otherOpt==3) {
                System.out.println("Villaların ortalama metrekaresi"+service.getAvgMsquareOfVillas()+" m2");
            }else if (otherOpt==4) {
                System.out.println("Yazlıkların ortalama metrekaresi"+service.getAvgMsquareOfSummerHouses()+" m2");
            }else if (otherOpt==5) {
                System.out.println("Tüm tipteki konutların ortalama metrekaresi: "+service.getAvgMsquaresOfAll()+" m2");
            } else if (otherOpt==6) {
                System.out.println("Lütfen oda ve salon sayılarını giriniz");

                System.out.println("Lütfen oda sayısını giriniz: ");
                int numberOfRoom=input.nextInt();
                System.out.println("Lütfen Salon sayısını giriniz: ");
                int numberOfHall=input.nextInt();


                System.out.println("Aşağıda "+ numberOfRoom+ " + " + numberOfHall +
                        " oda ve salona sahip konutların listesini görebilirsiniz...");
                System.out.println(service.getFilteredList(numberOfRoom,numberOfHall));
            }

        } else if (opSelection==5) {
            System.out.println("Çıkış yapılıyor...");
            loginCheck=false;
        } else {
            System.out.println("Lütfen geçerli bir sayı giriniz!");
            System.out.println("1- Evlerin Listesi\n2- Vilların Listesi\n3- Yazlıkların Listesi");
            opSelection = input.nextInt();

        }
        }

    }
}
