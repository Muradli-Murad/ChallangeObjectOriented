public class Main {
    public static void main(String[] args) {


        BankAccount muradAccount = new BankAccount("123665455ASDADA",0.1,"Murad Muradli","muradli.murad96@gmail.com","0775333711");
        System.out.println(muradAccount.getAccountBalance());
        System.out.println(muradAccount.getAccountNumber());

//        BankAccount muradAccount = new BankAccount("123665455ASDADA",0.1,"Murad Muradli","muradli.murad96@gmail.com","0775333711");
//        System.out.println(muradAccount.getAccountBalance());
//        System.out.println(muradAccount.getAccountNumber());


//        muradAccount.setAccountNumber("123665455ASDADA");
//        muradAccount.setAccountBalance(0.1);
//        muradAccount.setCustomerName("Murad Muradli");
//        muradAccount.setEmail("muradli.murad96@gmail.com");
//        muradAccount.setPhoneNumber("0775333711");

        muradAccount.withdrowingFunds(50.23);
        muradAccount.depositingFunds(250.093);
        muradAccount.withdrowingFunds(50.23432);


        BankAccount murad2Account=new BankAccount("Murad","@email","0775333712");
        System.out.println("Account No: "+ murad2Account.getAccountNumber()+ "  Name: "+murad2Account.getCustomerName());
    }
}