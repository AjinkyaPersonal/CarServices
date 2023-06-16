import java.util.ArrayList;
import java.util.HashMap;

public class Bill {
    private CarService carService;

    private ArrayList<String> serviceCodes;

    Bill(CarService carService , ArrayList<String> serviceCodes){
        this.carService = carService;
        this.serviceCodes = serviceCodes;
    }


    public int calculateBill(){
        int sum = 0;
//

        if(carService instanceof SUV){
            for(String str : serviceCodes){

                sum+= carService.getServicePrices().get(str).price;

            }
//            sum += carService.basicService();
        }else if(carService instanceof Hatchback){
            for(String str : serviceCodes){
               sum+= carService.getServicePrices().get(str).price;
            }

        }else if(carService instanceof Sedan){
            for(String str : serviceCodes){
                sum+= carService.getServicePrices().get(str).price;
            }

        }
        return sum;
    }
}
