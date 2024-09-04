public record Denomination(String noteName, double noteValue) {
    public String form(){
        return ((noteValue > 0.99) ? "bill" : "coin");
    }
    public String img() {
       return (noteName + ".png");
    }
}
