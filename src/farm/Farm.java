package farm;

public class Farm {
Farmer farmer;
HomeAnimals[] ha = new HomeAnimals[10];

public void dayOnFarm(){
    farmer.resource -=2;
    farmer.takeRes(ha);
}
}
