class SpringSeasonCheck {
    public static void main(String[] args) {

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if (month >= 3 && month <= 6) {

            if (month == 3 && day < 20) {
                System.out.println("Not a Spring Season");
            } 
            else if (month == 6 && day > 20) {
                System.out.println("Not a Spring Season");
            } 
            else {
                System.out.println("Its a Spring Season");
            }

        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
