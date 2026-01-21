class ProfitCalculation {
public static void main (String[]args){
int costPrice = 129;
int sellingPrice = 191;
int profit = sellingPrice - costPrice;
double profitpercent = (profit * 100.0)/costPrice;
System.out.println("The cost Price is INR" + 
costPrice + "and selling Price is INR" + 
sellingPrice + "\nThe profit is INR" + profit
+ "and the profit percentage is " +
profitpercent);
}
}