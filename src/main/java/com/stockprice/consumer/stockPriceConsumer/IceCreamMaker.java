package com.stockprice.consumer.stockPriceConsumer;

import java.util.ArrayList;
import java.util.List;

public class IceCreamMaker {

    public IceCream make(Integer size, String typeOfIceCream, String containerType ) {
        String receipe =receipe(typeOfIceCream);
        String container=findContainer(size,containerType);
        List<String> materials = getMetirials(receipe);
        IceCream iceCream =fillContainer(container,materials);
        return iceCream;
    }

    private IceCream fillContainer(String container, List<String> materials) {
        IceCream iceCream = new IceCream();
        iceCream.setContainerType(container);
        String typeOfIcream ="";
        for(String material:materials){
            typeOfIcream=typeOfIcream+material;
        }

        iceCream.setTypeOfIcecream(typeOfIcream);
        return iceCream;
    }

    private List<String> getMetirials(String receipe) {
        List materials= new ArrayList();
        if(receipe.equals("milkvanila")){
            materials.add("milk");
            materials.add("vanila");
        }else if(receipe.equals("milkmango")){
            materials.add("milk");
            materials.add("mango");
        }
        return materials;
    }

    private String receipe(String typeOfIceCream) {
        if(typeOfIceCream.equals("Vanila")) {
            return "milkvanila";
        }else if(typeOfIceCream.equals("mango")){
            return "milkmango";
        }
        return null;
    }

    private String findContainer(Integer size,String containerType){
        if(size==0 && containerType.equals("Cup")){
            return "smallcup";
        }if(size==1 && containerType.equals("Cup")){
            return "mediumcup";
        }if(size==2 && containerType.equals("Cup")){
            return "largecup";
        }if(size==0 && containerType.equals("Cone")){
            return "samllcone";
        }
return null;
    }
}
