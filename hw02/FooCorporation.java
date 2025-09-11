class FooCorporation{
    public static void calcWage(double basePay, double hour){
        if (basePay < 8 || hour > 60){
            System.out.println("Error");
        }
        else if (hour > 40){
            double wage = basePay * 40 + basePay * 1.5 * (hour - 40);
            System.out.println(wage);
        }
        else{
            double wage = basePay * hour;
            System.out.println(wage);
        }
    }

    public static void main(String[] arguments){
        calcWage(7.5, 35);
        calcWage(8.2, 47);
        calcWage(10.00, 73);
    }
}