public class FinancialForecast {

    public static double forecast(double amount,int years,double rate){

        if(years==0)

            return amount;

        return forecast(amount*(1+rate),years-1,rate);

    }

    public static void main(String args[]){

        double future=forecast(10000,5,0.10);

        System.out.println("Future Value : "+future);

    }

}