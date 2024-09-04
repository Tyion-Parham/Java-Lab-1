import java.util.HashMap;
import java.util.Map;

public class Purse {
    public HashMap<Denomination, Integer> cash = new HashMap<>();

    public void addToPurse(Denomination d, Integer amount) {
        cash.put(d, amount);
    }

    public double removeFromPurse(Denomination d, Integer amount) {
        double withdraw = (cash.get(d.noteValue()) * amount);
        cash.remove(d, amount);
        return withdraw;
    }

    public double getValue() {
        double total = 0;
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
            total += entry.getValue();
        }
        return total;
    }

    public String toString() {
        String contents = "";
        if (cash.isEmpty()) {
            return "Nothing";
        }
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()){
            contents = contents + cash.get(entry.getValue()) + " " + entry.getKey() + "\n";
        }
        return contents;
    }
}
