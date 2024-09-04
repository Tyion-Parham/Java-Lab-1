//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Register {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public static Purse makeChange (double amt){
        Integer tempnum;
        Purse p = new Purse();
        Denomination hundred = new Denomination("hundres-dollar note", 100);
        Denomination fifty = new Denomination("fifty-dollar note", 50);
        Denomination twenty = new Denomination("twenty-dollar note", 20);
        Denomination ten = new Denomination("ten-dollar note", 10);
        Denomination five = new Denomination("five-dollar note", 5);
        Denomination one = new Denomination("one-dollar note", 1);
        Denomination quarter = new Denomination("quarter", .25);
        Denomination dime = new Denomination("dime", .1);
        Denomination nickel = new Denomination("nickel", .05);
        Denomination penny = new Denomination("penny", .01);

        while (amt > 0){
            tempnum = 0;
            if (amt >= 100){
                while (amt >= 100){
                    tempnum++;
                    amt -= 100;
                }
                p.addToPurse(hundred, tempnum);
            } else if (amt >= 50) {
                while (amt >= 50){
                    tempnum++;
                    amt -= 50;
                }
                p.addToPurse(fifty, tempnum);
            }else if (amt >= 20){
                while (amt >= 20){
                    tempnum++;
                    amt -= 20;
                }
                p.addToPurse(twenty, tempnum);
            }else if (amt >= 10){
                while (amt >= 10){
                    tempnum++;
                    amt -= 10;
                }
                p.addToPurse(ten, tempnum);
            }
        }
    }

}