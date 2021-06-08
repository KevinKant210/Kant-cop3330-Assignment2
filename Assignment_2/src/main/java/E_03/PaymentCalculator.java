/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_03;




//n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)


/*
n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.

 */

public class PaymentCalculator {

    static public int calculateMonthsUntilPaidOff( double i, double b , double p){
        double term1 = -1.0/30.0;

        double term2 = Math.pow((1.0+i),30);
        double term3 = Math.log(1+b/p*(1-term2));
        double result = term1*term3/Math.log(i+1);

        return (int) Math.ceil(result);


    }
}
