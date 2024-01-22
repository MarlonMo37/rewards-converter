public class RewardValue {
    int miles;
    double cash;

    public RewardValue(double c) {
        cash = c;
    }

    public RewardValue(int m) {
        miles = m;
    }

    public double getCashValue() {
        return this.miles * 0.0035;
    }

    public double getMilesValue() {
      return  this.cash / 0.0035;
    }


}
