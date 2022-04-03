public class BonusMilesService {
    public int calculate(int price) {

        int bonusSum = 20;
        int bonus = price / bonusSum;

        return bonus;
    }


}
