/**
 * Created by noelaniekan on 11/16/16.
 */
public class Transaction {
    private String name;
    private int amount;
    private String WhatWouldYouLikeToDo;

    public void chooseName() throws Exception {
        System.out.println("Please enter name");
        name = ATM.scanner.nextLine();
        System.out.println("Welcome," + name);
        if (name.equalsIgnoreCase("")) {
            throw new Exception("Please enter valid name");
        }


    }



    public void chooseWhatWouldYouLikeToDo() throws Exception{
        System.out.println("choose what would you like To do [check My Balance/withdraw/cancel]");
        WhatWouldYouLikeToDo = ATM.scanner.nextLine();

        if (WhatWouldYouLikeToDo.equalsIgnoreCase("check my balance")) {
            System.out.println("Your balance is $100");

        } else if (WhatWouldYouLikeToDo.equalsIgnoreCase("withdraw fund")) {
            System.out.println("How much do you want to withdraw");
            amount = ATM.scanner.nextInt();
            if (amount > 100) {
                throw new Exception("Insufficient Funds");
            }
            else if (amount <= 100) {
                System.out.println("Available Balance" + (100 - amount) + " Take cash below. Have a nice day ");
            }
            System.out.println("$" + amount);


            }
            else if (WhatWouldYouLikeToDo.equalsIgnoreCase("cancel")) {
                System.out.println(" Thank you please come again...");
            }
        }
    }

