public class Insurance {
    int add(int propertyCost, int houseInsurance){
        return propertyCost + houseInsurance;
    }

    double add(double propertyCost, double houseInsurance){
        return propertyCost + houseInsurance;
    }
}

class TotalCost{
    public static void main(String[] args){
        Insurance insurance = new Insurance();

        int intResult = insurance.add(500000, 4000);
        System.out.println(" reulst: " +intResult);


        double doubleResult = insurance.add(100.5, 200.5 );
        System.out.println(" double result: " +doubleResult);
    }
}
