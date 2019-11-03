public class Numeral extends Expression{
    private double value;
    public Numeral (){
        this.value = 0;
    }
    public Numeral (double _value){
        this.value = _value;
    }
    public double evaluate() {
        return value;
    }
    public double getValue() {
        return value;
    }

    public void setValue(double _value) {
        this.value = _value;
    }
    public String toString() {
        return Double.toString(value);
    }
}
