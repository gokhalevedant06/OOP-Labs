package LAB8;

public class Bill {
    public double findPrice(int itemId){
        if (itemId==1001) return 25;
        else if (itemId==1002) return 20;
        else if (itemId==1003) return 23;
        else if (itemId==1004) return 18;
        else return 0;
    }
    public double findPrice(String brandName, String itemType, int size){
        if(brandName.equals("Puma")){
            if(itemType.equals("T-shirt")){
                return 25;
            }else{
                return 20;
            }
        }else if (brandName.equals("Reebok")){
            if(itemType.equals("T-shirt")){
                return 23;
            }else{
                return 18;
            }
        }
        else{
            return 0;
        }
    }

}


